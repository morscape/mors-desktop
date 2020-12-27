require('../../bigint.min.js');
const Player = require('../../api/player.js');

class ValueDeobfuscator{
    static classmap = {
        "in": function newplayer1(value) {return new Player(value);},
        "hv": function newplayer2(value) {return new Player(value);}
    };

    static deobfuscateValue(value, deobfuscationArgs){
        if (deobfuscationArgs[0] === "int"){
            return ValueDeobfuscator.deobInt(value, deobfuscationArgs[1]);
        }else if (deobfuscationArgs[0] === "long"){
            return ValueDeobfuscator.deobLong(value, deobfuscationArgs[1]);
        }else{
            return value;
        }
    }

    // static deobInt(value, decopvalue){
    //     var decop = new bigInt(decopvalue);
    //     var maxinteger = new bigInt(1).shiftLeft(31);
    //     return ( decop *  new bigInt(value))  % maxinteger;
    //
    // }
    static deobInt(value, decopvalue){
        // var decop = ValueDeobfuscator.modInverse( new bigInt(1).shiftLeft(31) + new bigInt(decopvalue), new bigInt(1).shiftLeft(32));
        // var decop = ValueDeobfuscator.modInverse( new bigInt(decopvalue));
        var decop = new bigInt(decopvalue);
        // if(!Number.isNaN(decop)){
        //     // console.log("decop: " + decopvalue + " decop + 2^31: " + (new bigInt(1).shiftLeft(31) + new bigInt(decopvalue)) + " mod32 inverse:" + decop );
        // }else{
        //     console.log("decop: " + decopvalue + " decop + 2^31: " + (new bigInt(1).shiftLeft(31) + new bigInt(decopvalue)))
        // }
        var maxinteger = new bigInt(1).shiftLeft(32);
        var halfmax = new bigInt(1).shiftLeft(31);
        var deobfuscated = ( decop *  new bigInt(value))  % maxinteger;
        while (deobfuscated >= halfmax/2){
            deobfuscated -=halfmax
        }
        while (deobfuscated <= -halfmax/2){
            deobfuscated +=halfmax
        }
        return deobfuscated;
    }

    static deobLong(value, decopvalue){
        var decop = new bigInt(decopvalue);
        var maxinteger = new bigInt(1).shiftLeft(63);
        return ( decop *  new bigInt(value))  % maxinteger;
    }

    static modInverse1(a, m) {
        // validate inputs
        // [a, m] = [Number(a), Number(m)];
        // if (Number.isNaN(a) || Number.isNaN(m)) {
        //     return NaN // invalid input
        // }
        console.log("a " + a + " m " + m);
        a = (a % m + m) % m;
        if (!a || m < 2) {
            return NaN // invalid input
        }
        // find the gcd
        const s = [];
        var b = bigInt(m);
        console.log("a " + a + " b " + b);

        while(b.value) {
            var a1 = b;
            b =  a % b;
            a = a1;
            console.log("a " + a + " b " + b);
            s.push({a, b})
        }
        console.log("a " + a.value);
        if (a !== 1) {
            return NaN // inverse does not exists
        }
        // find the inverse
        var x = 1;
        var y = 0;
        for(var i = s.length - 2; i >= 0; --i) {
            [x, y] = [y,  x - y * Math.floor(s[i].a / s[i].b)]
        }
        return (y % m + m) % m
    }
    static modInverse(val)    {
        // return ValueDeobfuscator.modInverse1(val,new bigInt(1).shiftLeft(32));

        return new bigInt(val).modInv(new bigInt(1).shiftLeft(32));
    }

}

module.exports = ValueDeobfuscator;
