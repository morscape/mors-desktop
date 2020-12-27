require('./bigint.min.js');
const Player = require('./api/player.js');
const WorldMapScaleHandler = require('./api/worldMapScaleHandler.js');

Java.perform(function() {
    var clientcycle = "$0";
    var nameWorldMapScaleHandler = "$1";
    var staticPlayer = "$2";
    var namePlayer = "$3";
    var playerAnimationField = "$4";
    var playerSpotField = "$6";
    // var classWorldMapScaleHandler = Java.use(nameWorldMapScaleHandler);
    // var localPlayer = classWorldMapScaleHandler[staticPlayer].value;
    var localPlayer = WorldMapScaleHandler.getCurrentPlayer();
    // var classPlayer = Java.use(namePlayer);
    // var fxClazz = Java.cast(localPlayer,classPlayer);
    // var p = new Player("test");
    //
    // console.log("static : " + Player.getstatic());
    // console.log("method : " + p.getNG());
    // console.log("method : " + p.getNG);
    // console.log("field : " + p.ng);

    var counter = 0;
    // var Player = global.player;
    Java.use("client")[clientcycle].overload("byte").implementation = function(byte) {
        counter++;
        if (counter % 50 === 0){
            // console.log('fx class: (cast ' + namePlayer + ' )'+fxClazz + " ("  + classPlayer.class.getDeclaredFields()+")");
            // var javaFieldAnimation = classPlayer.class.getDeclaredField(playerAnimationField);
            // javaFieldAnimation.setAccessible(true);
            //
            // var javaFieldSpot = classPlayer.class.getDeclaredField(playerSpotField);
            // javaFieldSpot.setAccessible(true);
            var p = new Player(localPlayer);
            // console.log('test class: ' + p.sequence());
            // console.log('fx field:'+ javaFieldAnimation + "(" + javaFieldAnimation.getClass()+")");

            // var obPlayerAniID = javaFieldAnimation.get(fxClazz);
            // var obPlayerSpotID = javaFieldSpot.get(fxClazz);
            //
            // if(obPlayerAniID == null && fxClazz[playerAnimationField] != null) {
            //     obPlayerAniID = fxClazz[playerAnimationField].value;
            // }
            // if(obPlayerSpotID == null && fxClazz[playerSpotField] != null) {
            //     obPlayerSpotID = fxClazz[playerSpotField].value;
            // }
            //
            // var maxinteger = new bigInt(1).shiftLeft(32);
            // var decopAnimation = new bigInt($5);
            // var deobfuscatedAniID = deobInt(decopAnimation, obPlayerAniID);
            // var decopStop = new bigInt($7);
            // var deobfuscatedSpotID = deobInt(decopStop, obPlayerSpotID);


            // deobfuscatedAniID = ( decopAnimation *  new bigInt(obPlayerAniID)) % maxinteger;
            // deobfuscatedSpotID = ( decopStop *  new bigInt(obPlayerSpotID)) % maxinteger;
            // console.log("field: " +nameWorldMapScaleHandler + "." + staticPlayer+"."+ playerAnimationField + " = " + obPlayerAniID + "(* " + decop + " % " + maxinteger + " = " +  deobfuscatedAniID + ")");
            // if (deobfuscatedAniID !== 0) {
            //     console.log("ani: " + deobfuscatedAniID + " spot: " + deobfuscatedSpotID )
            // }
            console.log("ani: " + p.getAnimation() + " spot: " + p.getSpotAnimation() )

        }
        this.cc(byte);
    };

    // console.log('fx class: (cast ' + namePlayer + ' )'+fxClazz + " ("  + classPlayer.class.getDeclaredFields()+")");
    // var h = classPlayer.class.getDeclaredField(playerAnimationField);
    // h.setAccessible(true);
    // console.log('fx field:'+ h + "(" + h.getClass()+")");
    // var hInstance = h.get(fxClazz);
    // if(hInstance == null && fxClazz[field] != null) {
    //     var hInstance = fxClazz[field].value;
    //
    // }
    // var decop = new bigInt($5);
    // var maxinteger = new bigInt(1).shiftLeft(32);
    // var deobfuscated = deobInt(decop, hInstance);
    // // var deobfuscated = ( decop *  new bigInt(hInstance)) % maxinteger;
    // console.log("field: " +nameWorldMapScaleHandler + "." + staticPlayer+"."+ playerAnimationField + " = " + hInstance + "(* " + decop + " % " + maxinteger + " = " +  deobfuscated + ")");

    // print_all_instances_field(className,field);
});
function executeEveryNCycle(fun, n){

}

function deobInt(decopvalue, value){
    var decop = new bigInt(decopvalue);
    var maxinteger = new bigInt(1).shiftLeft(32);
    var halfmax = new bigInt(1).shiftLeft(31);
    var deobfuscated = ( decop *  new bigInt(value))  % maxinteger;
    while (deobfuscated > halfmax){
        deobfuscated -=maxinteger
    }
    while (deobfuscated < -halfmax){
        deobfuscated +=maxinteger
    }
    return deobfuscated;
}

function print_all_instances_field(className, field) {

    Java.choose(className, {
        onMatch: function (instance) {
            var fxInstance = instance;
            var fxClazz = Java.cast(fxInstance,Java.use(className));
            print_field(fxClazz, className, field, 0)
        },
        onComplete: function() { }
    });
}
function print_field(fxClazz, className, field, rec){
    // var h = Array.from(fxClazz);
    console.log('fx class:'+fxClazz + "(" + fxClazz.getClass().getDeclaredFields()+")");
    var h = fxClazz.getClass().getDeclaredField(field);
    h.setAccessible(true);
    console.log('fx field:'+ h + "(" + h.getClass().getDeclaredFields()+")");

    var hInstance = h.get(fxClazz);
    // var hInstance = null;

    if(hInstance == null && fxClazz[field] != null) {
        var hInstance = fxClazz[field];

    }
    var decop = 1829036089;
    var deobfuscated = ( new bigInt(decop) *  new bigInt(hInstance)) % new bigInt(1).shiftLeft(32);
    console.log("field: " +className + "." +  field + " = " + hInstance + "(decop:" +  deobfuscated + ")");

}

function print_objects(hInstance, className, pretext, rec) {

    if(!hInstance){
        return;
    }
    if(hInstance.toString().startsWith("[object Object]")  && rec < 1){
        console.log(pretext + "  :  " + hInstance);
        // print_fields(hInstance,"object", rec++);

    }else {
        if (Array.isArray(hInstance)) {
            for (var l = 0; l < hInstance.length - 1; l++) {
                print_objects(hInstance[l], className, pretext + "  :  " + l + " : ", rec);
            }
        } else if (Number.isFinite(hInstance)) {
            var decop = 1829036089;
            console.log(pretext + "  :  " + decop + " " + hInstance * modInverse(decop));
        } else {
            console.log(pretext + "  :  " + hInstance);
        }
        var hProperties = Object.getOwnPropertyNames(hInstance.__proto__);
        if (hProperties.join(" ").indexOf("$className") != -1 && hInstance["$className"] && className !== hInstance["$className"] && rec < 2) {
            // console.log("Going deeper: " + rec + " : " + hProperties.join(" ") );
            //     var fxClazz = Java.cast(fxInstance,Java.use(className));
            // console.log(pretext + rec + "  :  " + Java.cast(hInstance,Java.use(hInstance["$className"])));
            print_fields(Java.cast(hInstance, Java.use(hInstance["$className"])), hInstance["$className"], rec + 1);
            // console.log(pretext + "  :  " + hInstance);

        }
    }
}
function modInverse1(a, m) {
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
    console.log(b + " " + b.value)

    while(b.value) {
        var a1 = b;
        b =  a % b;
        a = a1;
        s.push({a, b})
    }
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
function modInverse(val)    {
    return modInverse1(val,new bigInt(1).shiftLeft(32));
}

function print_fields(fxClazz,className, rec){
    // var h = Array.from(fxClazz);
    var h = Object.getOwnPropertyNames(fxClazz.__proto__).filter(function(m) {
        if ( !m.startsWith('$') && m !== 'class' && m !== 'constructor') {
            return fxClazz[m] != null;
        }else{
            return false;
        }
    });
    // if(className === 'object') console.log("h: " + h.join(" "));
    for (var i in h){
        if(fxClazz[h[i]] != null && fxClazz[h[i]].value != undefined ) {
            var hInstance = fxClazz[h[i]].value;
            var tabs = "";
            for (var l = 0; l < rec; l++){
                tabs += "\t"
            }

            if(hInstance.toString().startsWith("[object Object]")  && rec < 1){
                console.log(tabs + "field: " +className + "." +  h[i] + "  :  " + hInstance);
                // print_fields(hInstance,"object", rec++);

            }else{
                if (Array.isArray(hInstance)) {
                    for (var l = 0; l < hInstance.length - 1; l++) {
                        print_objects(hInstance[l], className, tabs + "field: " +className + "." + h[i]  + "[]  :  " + l + " : ", rec);
                    }
                } else if (Number.isFinite(hInstance)) {
                    var decop = -1533147719;
                    var modInverse1 = modInverse(decop);
                    console.log(tabs + "field: " +className + "." + h[i] + " (int) :  mod inverse: " + modInverse1 + " deob value:" + decop + " ob value: " + hInstance  + " modInverse(instance): " + modInverse(hInstance) + "  finale value: " + hInstance * modInverse1);

                    // hInstance = modInverse(hInstance);
                    // console.log(tabs + "field: " +className + "."  + h[i] + "  :  " + hInstance);
                } else {
                    console.log(tabs + "field: " +className + "."  + h[i] + "  :  " + hInstance);
                }
                // console.log(tabs + "field: " +className + "." +  h[i] + "  :  " + hInstance);
                var hProperties = Object.getOwnPropertyNames(hInstance.__proto__);
                if (hProperties.join(" ").indexOf("$className") != -1 && hInstance["$className"] && className !== hInstance["$className"] && rec < 2){
                    // console.log("Going deeper: " + rec + " : " + hProperties.join(" ") );
                    print_fields(Java.cast(hInstance,Java.use(hInstance["$className"])),hInstance["$className"],rec+1);
                }
            }


        }
    }

}

