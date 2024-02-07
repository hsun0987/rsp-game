let url = "/api/rsp";

document.querySelector('#form').addEventListener('click', (event => {
   // you
    let you = event.target.getAttribute('src');

    let html = `
        <img src="${you}">
        You
    `
    document.querySelector('#you').innerHTML = html;
    if(you.includes("rock")){
        you = "rock";
    }else if(you.includes("scissors")){
        you = "scissors";
    }else{
        you = "paper";
    }

    // computer
    let num = parseInt(Math.random() * 3 + 1);
    let computer;
    switch (num){
        case 1:
            computer = "rock";
            break;
        case 2:
            computer = "scissors";
            break;
        case 3:
            computer = "paper";
            break;
    }
    let html2 = `
        <img src="/rsp_game/${computer}.png">
        Computer
    `


    turn(you, computer);
}));


async function turn(you, computer){
    await fetch(url, {
        method: "POST",
        headers : {
            "content-type": "application/json"
        },
        body: JSON.stringify({
            you: you,
            computer: computer,
        }),
    }).then((response) => response.json())
        .then((result) => {
            document.getElementById('win').innerHTML = `${result[0]}`;
            document.getElementById('lose').innerHTML = `${result[1]}`;
            document.getElementById('draw').innerHTML = `${result[2]}`;
        });

}
