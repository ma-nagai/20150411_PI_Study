@Grab('org.gebish:geb-core:0.9.2')
@Grab('org.seleniumhq.selenium:selenium-firefox-driver')

import geb.Browser

Browser.drive {
   //URL���R�s�y����Ƃ��͉~�}�[�N���X���b�V���ɒ������ƁI
   go 'file:///D:/Temp/handson/introWork/Introwork_�\��.html'
   
   //�����v�f���܂Ƃ߂Ďw��
   $($("p.c"), $("p.e")).each{
   def str = it.text()
   println str
   }
   
}