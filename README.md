# 20150411_PIStudy

１．本サイト（https://github.com/ma-nagai/PI_Study_Pre）を開く  
  
２．「Download Zip」クリックし、ダウンロードした「PI_Study_Pre-master.zip」を解凍する。  
　　（ここではC:\PI_Study_Pre-masterに解凍）  
  
３．「StarHotel」プロジェクトをeclipseに追加  
　　※eclipseを起動し、下記の順番でプロジェクトを追加する  
　　①メニューから「ファイル＞新規＞Groovy Project」順でクリック  
　　②デフォルト・ロケーションを使用のチェックを外し、「参照」をクリック  
　　③２．で解凍したフォルダ中の「StarHotel」を指定して「完了」をクリック  
　　④elcipseに追加された「StarHotel」を右クリックし、「構成」＞「Mavenプロジェクトへ変換」をクリック  
　　⑤elcipseに追加された「StarHotel」を右クリックし、「ビルド・パス＞ビルド・パスの構成」をクリック  
　　⑥「JREシステム・ライブラリー」をダブルクリックし、実行環境をjava7に変更して完了する  
　　⑦開いたプロパティを閉じる  
  
４．「StarHotel_Renew」プロジェクトをeclipseに追加  
　　※３．の手順と同様に「StarHotel_Renew」を追加する  
  
５．動作確認  
　　①「ReserveInputMain.groovy」を右クリックし、「実行＞Groovy Script」で実行する。  
　　②firefoxブラウザが立ち上がり、宿泊日の年の入力ボックスにカーソルが止まっていることを確認できれば完了です。  
  
  
※講義用の教材の一部に以下を使用させて頂いています  
https://sites.google.com/site/testautomationresearch/teaching_materials  
