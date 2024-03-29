<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="/rsp_game/style.css" />
    <title>Rock & Scissors & Paper</title>
</head>
<body>
<div id="form">
    <img src="/rsp_game/rock.png">
    <img src="/rsp_game/scissors.png">
    <img src="/rsp_game/paper.png">
</div>
<hr/>
<hr/>
<ul>
    <li>Win count : <span id="win">0</span></li>
    <li>Lose count : <span id="lose">0</span></li>
    <li>Draw count : <span id="draw">0</span></li>
</ul>
<hr/>
<hr/>
<div id="result">
    <div id="you">
        <img src="/rsp_game/scissors.png">
        You
    </div>
    <div id="computer" class="winner">
        <img src="/rsp_game/rock.png">
        Computer
    </div>
</div>

<script src="/rsp_game/script.js"></script>
</body>
</html>