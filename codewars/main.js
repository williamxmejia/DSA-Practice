//7kyu

function calc(x) {
    let total1 = [];
    let total2 = 0;
    for (let i = 0; i < x.length; i++) {
        total1 += (x.charCodeAt(i).toString());
    }
    for (let i = 0; i < total1.length; i++){
        if(total1.charAt(i) === '7'){
            total2 += 6;
        }
    }

    return total2;

}

// console.log(calc("ABC"));
console.log(calc("ifkhchlhfd"));
console.log(calc("aaaaaddddr"));
console.log(calc("jfmgklf8hglbe"));
console.log(calc('abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ'));