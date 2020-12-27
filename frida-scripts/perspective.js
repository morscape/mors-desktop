require('./bigint.min.js');
// require('./api/core/apicore.js');

const Player = require('./api/player.js');
const WorldMapScaleHandler = require('./api/worldMapScaleHandler.js');
const Client = require('./api/client.js');

Java.perform(function() {
    var properties = Object.getOwnPropertyNames(Client);
    var propertiesMap = {};
    function todo(args){
        for (var property in properties){
            if ((properties[property].startsWith("getField") && properties[property] !== "getField4785") && typeof(Client[properties[property]]) === 'function') {
            // if ((properties[property].startsWith("getCycle")) && typeof(Client[properties[property]]) === 'function') {
                var propertyValue = Client[properties[property]]();
                if(propertyValue !== undefined && Number.isInteger(propertyValue)){
                    if (!propertiesMap.hasOwnProperty(property)){
                        propertiesMap[property] = [];
                    } else if (propertiesMap[property][propertiesMap[property].length - 1] !== propertyValue){
                        propertiesMap[property].push(propertyValue);
                        console.log("property number: " + property + " is " + properties[property] + " = " + propertyValue)

                    }
                }

            }
        }
    }
    Client.onVmethod8288(todo)
});

// Client.method8308