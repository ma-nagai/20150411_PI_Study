@Grab('org.gebish:geb-core:0.9.2')
@Grab('org.seleniumhq.selenium:selenium-firefox-driver')

import geb.Browser

Browser.drive {
   //URLをコピペするときは円マークをスラッシュに直すこと！
   go 'file:///D:/Temp/handson/introWork/Introwork_regular_expression.html'
   
   //全て（任意の一文字と0回か1回以上マッチング）
   assert $("p", text: ~/.*/).size() == 5
   //完全一致
   assert $("p", text: ~/test/).size() == 1
   //範囲指定
   assert $("p", text: ~/[a-z]*/).size() == 4
   //先頭文字が"a"から始まる要素とマッチング
   assert $("p", text: ~/^a.*/).size() == 2
   //末尾が"a"で終わる要素とマッチング
   assert $("p", text: ~/.*a$/).size() == 2

}