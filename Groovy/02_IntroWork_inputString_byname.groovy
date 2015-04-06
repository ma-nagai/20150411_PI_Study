@Grab('org.gebish:geb-core:0.9.2')
@Grab('org.seleniumhq.selenium:selenium-firefox-driver')

import geb.Browser

Browser.drive {
   //URLをコピペするときは円マークをスラッシュに直すこと！
   go 'file:///D:/Temp/handson/introWork/introWork_inputString_byname.html'
   
   assert title == 'IntroWork1_C'
  
   //name指定で要素取得

   
   
}