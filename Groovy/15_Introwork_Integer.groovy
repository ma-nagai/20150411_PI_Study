@Grab('org.gebish:geb-core:0.9.2')
@Grab('org.seleniumhq.selenium:selenium-firefox-driver')

import geb.Browser

Browser.drive {
   
   go 'file:///D:/Temp/handson/introWork/Introwork_Integer.html'
   
   //ç≈ëÂíl
   assert $("p").max { it.text() }.text() == "5"
   //ç≈è¨íl
   assert $("p").min { it.text() }.text() == "1"
   
   
}