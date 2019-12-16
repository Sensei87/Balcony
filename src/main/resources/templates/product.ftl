<html>
<head>

</head>
<body>

<div>
    <form method="post">
        <input type="text" name="text" placeholder="Найти товар" />
        <input type="text" name="tag" placeholder="Id">
        <button type="submit">Добавить</button>
    </form>
</div>
<div>Список товаров</div>
<form method="post" action="filter">
    <input type="text" name="filter">
    <button type="submit">Найти</button>
</form>
{#messages}
<div>
    <b>${id}</b>
    <span>${name}</span>

</div>
{/messages}

</body>
</html>