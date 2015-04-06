@Grab('org.gebish:geb-core:0.9.2')
@Grab('org.seleniumhq.selenium:selenium-firefox-driver')

import geb.Browser

Browser.drive {

    //new FirefoxDriver()
    go 'file:///D:/Temp/handson/introWork/introWork_radiobutton.html'
    
    //ラジオボタン（あり）押下
    
    
    sleep(1000)
    
    //ラジオボタン（ない）押下
    
    

}