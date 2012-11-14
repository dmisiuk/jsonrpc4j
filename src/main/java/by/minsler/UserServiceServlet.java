package by.minsler;

import com.googlecode.jsonrpc4j.JsonRpcServer;
import com.googlecode.jsonrpc4j.ProxyUtil;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserServiceServlet extends HttpServlet {

    private JsonRpcServer jsonRpcServer;


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        InputStream is = req.getInputStream();
//        is.mark(0);
//
//        BufferedReader r = new BufferedReader(new InputStreamReader(is,"UTF-8"));
//        String l;
//        System.out.print("start||");
//        while((l = r.readLine()) != null){
//            System.out.print(l);
//        }
//        System.out.print("||stop");
//        System.out.println();
//
//        is.reset();
        jsonRpcServer.handle(req, resp);
    }

    @Override
    public void init(ServletConfig config) {
        UserService userService = new UserServiceImpl();
        PrinterService printerService = new PrinterServiceImpl();
        Object[] services = new Object[]{userService, printerService};
        Class[] serviceClasses = new Class[]{UserService.class,PrinterService.class };
        Object compositeService = ProxyUtil.createCompositeServiceProxy(
           this.getClass().getClassLoader(),services,serviceClasses,true
        );
        this.jsonRpcServer = new JsonRpcServer(compositeService);
    }

}