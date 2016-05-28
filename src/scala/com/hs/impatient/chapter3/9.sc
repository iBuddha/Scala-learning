/**
 * Created by hs on 14-4-8.
 */
var timeZone = java.util.TimeZone.getAvailableIDs
//timeZone.map(println(_))

timeZone.filter(a=>a.startsWith("America")).map(a=>a.substring(a.lastIndexOf("America/")+9,a.length)
).map(println(_))




































