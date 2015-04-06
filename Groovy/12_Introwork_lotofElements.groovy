@Grab('org.gebish:geb-core:0.9.2')
@Grab('org.seleniumhq.selenium:selenium-firefox-driver')

import geb.Browser

Browser.drive {
   //URLをコピペするときは円マークをスラッシュに直すこと！
   go 'file:///D:/Temp/handson/introWork/Introwork_構成.html'
   
   //複数要素をまとめて指定
   $($("p.c"), $("p.e")).each{
   def str = it.text()
   println str
   }
   
}