@Grab('org.gebish:geb-core:0.9.2')
@Grab('org.seleniumhq.selenium:selenium-firefox-driver')

import geb.Browser

Browser.drive {
   //URL���R�s�y����Ƃ��͉~�}�[�N���X���b�V���ɒ������ƁI
   go 'file:///D:/Temp/handson/introWork/Introwork_shoutcutPatternMethod.html'
   
   //"a"����n�܂�v�f�ƃ}�b�`���O
   assert $("p", text: startsWith("a")).size() == 3
   //"a"�ŏI���v�f�ƃ}�b�`���O
   assert $("p", text: endsWith("a")).size() == 3
   //"test"���܂ޗv�f�ƃ}�b�`���O
   assert $("p", text: contains("test")).size() == 5
   //�󔒕�������؂蕶���Ƃ��Ďw�肵�������񂪊܂܂��ꍇ�}�b�`���O
   println "�󔒕�������؂蕶���Ƃ��Ďw�肵�������񂪊܂܂��ꍇ�}�b�`���O"
   assert $("p", text: containsWord("test")).each{elements->
   println elements.text()  
   }
   assert $("p", text: "test").size() == 1
   
   //"test"����n�܂�Ȃ��v�f�ƃ}�b�`���O
   assert $("p", text: notStartsWith("test")).size() == 4
   //"test"�ŏI���Ȃ��v�f�ƃ}�b�`���O
   assert $("p", text: notEndsWith("test")).size() == 4
   //"test"���܂܂Ȃ��v�f�ƃ}�b�`���O
   assert $("p", text: notContains("test")).size() == 1
   //�󔒕�������؂蕶���Ƃ��āA�����񂪊܂܂�Ȃ��ꍇ�}�b�`���O
   println "�󔒕�������؂蕶���Ƃ��āA�����񂪊܂܂�Ȃ��ꍇ�}�b�`���O"
   $("p", text:notContainsWord("test")).each{elements->
   println elements.text() 
   }
   
}