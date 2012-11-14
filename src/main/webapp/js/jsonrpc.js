var send = function(post_body){$.ajax({
    url: "/json",
    data: post_body,
    type: "POST",
    success: function(data){
        console.log(data);
        }
    })
}

var sendPost = function(url, data) {
    return $.post(url, JSON.stringify(a));
}

function Request(method, params)
{

//{"id":"232","jsonrpc":"2.0","method":"createUser","params":["bob","бобик","the builder"]}"

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