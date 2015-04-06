@Grab('org.gebish:geb-core:0.9.2')
@Grab('org.seleniumhq.selenium:selenium-firefox-driver')

import geb.Browser

Browser.drive {
   //URLをコピペするときは円マークをスラッシュに直すこと！
   go 'file:///D:/Temp/handson/introWork/Introwork_class.html'
   
   //シンプルに取得する場合
   assert $("p.test2").text() == "test1.test2"
   
   //pタグに囲まれていないclass=test2が呼ばれる
   assert $("div",class:"test2").text() == "test2"
   //pタグに囲まれているclass=test2を選ぶ場合
   assert $("div").find(".test2").text() == "test1.test2"
   assert $("div").filter(".test2").text() == "test2"
   
   //notメソッドを使う場合
   assert $(".test2").not("p").text() == "test2"
   //hasメソッドを使う場合
   assert $("div").has("p").text() == "test1.test2"
   

   
   
   
}