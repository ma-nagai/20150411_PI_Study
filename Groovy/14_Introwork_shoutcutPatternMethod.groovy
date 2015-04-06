@Grab('org.gebish:geb-core:0.9.2')
@Grab('org.seleniumhq.selenium:selenium-firefox-driver')

import geb.Browser

Browser.drive {
   //URLをコピペするときは円マークをスラッシュに直すこと！
   go 'file:///D:/Temp/handson/introWork/Introwork_shoutcutPatternMethod.html'
   
   //"a"から始まる要素とマッチング
   assert $("p", text: startsWith("a")).size() == 3
   //"a"で終わる要素とマッチング
   assert $("p", text: endsWith("a")).size() == 3
   //"test"を含む要素とマッチング
   assert $("p", text: contains("test")).size() == 5
   //空白文字を区切り文字として指定した文字列が含まれる場合マッチング
   println "空白文字を区切り文字として指定した文字列が含まれる場合マッチング"
   assert $("p", text: containsWord("test")).each{elements->
   println elements.text()  
   }
   assert $("p", text: "test").size() == 1
   
   //"test"から始まらない要素とマッチング
   assert $("p", text: notStartsWith("test")).size() == 4
   //"test"で終わらない要素とマッチング
   assert $("p", text: notEndsWith("test")).size() == 4
   //"test"を含まない要素とマッチング
   assert $("p", text: notContains("test")).size() == 1
   //空白文字を区切り文字として、文字列が含まれない場合マッチング
   println "空白文字を区切り文字として、文字列が含まれない場合マッチング"
   $("p", text:notContainsWord("test")).each{elements->
   println elements.text() 
   }
   
}