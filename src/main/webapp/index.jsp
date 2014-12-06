<html>
<script src="js/jquery-1.9.1.js"></script>
<script>
    var submitRequestBody = function () {
        $.ajax({
            type: "POST",
            url: "hello/requestBody",
            contentType: "application/json",
            //注意，这里必须是string类型，注释中的提交方式不能被RequestBody正确映射
            data: '{"id":1,"name":"cxh","password":"cxh123","bookList":[{"id":123,"name":"java core"}]}',
            success: function (data) {
                alert(data);
            }
        })
    }
    var submitRequestBody1 = function () {
        $.ajax({
                    type: "POST",
                    url: "hello/requestBody1",
                    contentType: "application/json",
                    //注意，这里必须是string类型，注释中的提交方式不能被RequestBody正确映射
//        data:{id:1,name:"cxh",password:"asdf",bookList:[{id:"1",name:"thinking in java",publication:"2014-12-12"},{id:"2",name:"java core",publication:"2012-11-12"}]}
                    data: '{"id":1,"name":"cxh"}',
                    success: function (data) {
                        alert(data);
                    }
                }
        )

    }
</script>
<body>
<h2>Hello World!</h2>
<button onclick="submitRequestBody()" value="submit">submit</button>
<br>
<button onclick="submitRequestBody1()" value="submit">submit</button>
</body>
</html>
