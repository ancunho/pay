<!DOCTYPE html>
<html>
<head>
    <title>支付</title>
    <script src="https://cdn.bootcss.com/jquery/1.5.1/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/jquery.qrcode/1.0/jquery.qrcode.min.js"></script>
</head>
<body>
<h1>支付</h1>
<div id="qrCodeDiv"></div>
<script type="text/javascript">
    $(document).ready(function (e) {
        $('#qrCodeDiv').qrcode({
            test : 'asdf'
        });
    });
</script>
</body>
</html>