@Grab('org.gebish:geb-core:0.9.2')
@Grab('org.seleniumhq.selenium:selenium-firefox-driver')

@Grab('org.seleniumhq.selenium:selenium-support:*')

import geb.Browser

Browser.drive {

    go 'file:///D:/Temp/handson/introWork/introWork_pulldown.html'
    
    //プルダウンから"2"を選択

    

}