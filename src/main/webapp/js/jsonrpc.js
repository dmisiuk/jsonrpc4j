var send = function(post_body){$.ajax({
    url: "/json",
    data: post_body,
    type: "POST",
    success: function(data){
        console.log(data);
        }
    })
}

var last_result;

var sendPost = function(url, req) {
    return $.post(url, JSON.stringify(req),function(data){

        alert("Data Loaded: " + data);

        console.log("sended");
        },
        "application/json-rpc"
        );
}

function Request(method, params)
{
    this.jsonrpc = "2.0";

    this.method = method;

    this.params = params;

    this.getMethod = function()
    {
        return this.method;
    };

    this.getParams = function()
    {
        return this.params;
    };
}