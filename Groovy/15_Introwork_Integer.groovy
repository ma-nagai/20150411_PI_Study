@Grab('org.gebish:geb-core:0.9.2')
@Grab('org.seleniumhq.selenium:selenium-firefox-driver')

import geb.Browser

Browser.drive {
   
   go 'file:///D:/Temp/handson/introWork/Introwork_Integer.html'
   
   //最大値
   assert $("p").max { it.text() }.text() == "5"
   //最小値
   assert $("p").min { it.text() }.text() == "1"
   
   
}