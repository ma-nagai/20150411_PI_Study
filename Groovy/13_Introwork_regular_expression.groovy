@Grab('org.gebish:geb-core:0.9.2')
@Grab('org.seleniumhq.selenium:selenium-firefox-driver')

import geb.Browser

Browser.drive {
   //URL���R�s�y����Ƃ��͉~�}�[�N���X���b�V���ɒ������ƁI
   go 'file:///D:/Temp/handson/introWork/Introwork_regular_expression.html'
   
   //�S�āi�C�ӂ̈ꕶ����0��1��ȏ�}�b�`���O�j
   assert $("p", text: ~/.*/).size() == 5
   //���S��v
   assert $("p", text: ~/test/).size() == 1
   //�͈͎w��
   assert $("p", text: ~/[a-z]*/).size() == 4
   //�擪������"a"����n�܂�v�f�ƃ}�b�`���O
   assert $("p", text: ~/^a.*/).size() == 2
   //������"a"�ŏI���v�f�ƃ}�b�`���O
   assert $("p", text: ~/.*a$/).size() == 2

}