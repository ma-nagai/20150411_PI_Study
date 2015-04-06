@Grab('org.gebish:geb-core:0.9.2')
@Grab('org.seleniumhq.selenium:selenium-firefox-driver')

import geb.Browser

Browser.drive {
   //URLをコピペするときは円マークをスラッシュに直すこと！
   go 'file:///D:/Temp/handson/introWork/introWork_inputString_byId.html'
   //go 'https://www.google.co.jp/'
   
   assert title == 'IntroWork1_B'
   //assert title == 'Google'
  
   //ID指定でテキストを指定し、中に'test1'と入力してください
   
   
   
   sleep(3000)
}