@Grab('org.gebish:geb-core:0.9.2')
@Grab('org.seleniumhq.selenium:selenium-firefox-driver')

import geb.Browser

Browser.drive {

    go 'file:///D:/Temp/handson/introWork/introWork_checkbox.html'
    
    //チェックをつける
    
    
    sleep(1000)
    
    //チェックを外す
    

}