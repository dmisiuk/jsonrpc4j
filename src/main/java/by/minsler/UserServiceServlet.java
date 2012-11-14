package by.minsler;

import com.googlecode.jsonrpc4j.JsonRpcServer;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserServiceServlet extends HttpServlet {

    private UserService userService;
    private JsonRpcServer jsonRpcServer;


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        jsonRpcServer.handle(req, resp);
    }

    @Override
    public void init(ServletConfig config) {
        this.userService = new UserServiceImpl();
        this.jsonRpcServer = new JsonRpcServer(this.userService, UserService.class);
    }

}