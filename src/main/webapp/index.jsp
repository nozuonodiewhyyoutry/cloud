<html>
<body>
<center>
    <input type="file" id="uploadfile" name="uploadfile" />
    <input type="button" value="upload" onclick="upload()" />
</center>
<script>
    var client = new XMLHttpRequest();
    function upload()
    {
        var file = document.getElementById("uploadfile");
        /!* Create a FormData instance *!/
        var formData = new FormData();
        /!* Add the file *!/
        formData.append("upload", file.files[0]);
        client.open("post", "/cloud/file/upload", true);
       // client.setRequestHeader("Content-Type", "multipart/form-data");
        client.send(formData);  /!* Send to server *!/
    }
    /* Check the response status */
    client.onreadystatechange = function()
    {
        if (client.readyState == 4 && client.status == 200)
        {
            alert(client.statusText);
        }
    }
</script>
</body>
</html>
