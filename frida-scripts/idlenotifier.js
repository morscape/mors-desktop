require('./bigint.min.js');
 const Player = require('./api/player.js');
const WorldMapScaleHandler = require('./api/worldMapScaleHandler.js');
const Client = require('./api/client.js');

Java.perform(function() {
    var localPlayer = WorldMapScaleHandler.getLocalPlayer();
    var counter = 0;
    function todo(args) {
        counter++;
        if (counter % 50 === 0) {
            console.log("ani: " + localPlayer.getSequence() + " spot: " + localPlayer.getField7550())
        }
    }
    Client.onVmethod8288(todo)
    //method8293 better (search cycle -= -1: method called at the end)
    // Client.onGameCycle(todo);
});