<html>
<head>
    <title>List of Product</title>
</head>
<body>

      <h3>List of Product</h3>
<div>
    <table border="1">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Price</th>
        </tr>
        <#list products as product>
            <tr>
                <td>product.id</td>
                <td>product.name</td>
                <td>product.price</td>
            </tr>
        </#list>
    </table>
</div>

</body>
</html>