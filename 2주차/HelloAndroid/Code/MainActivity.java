package com.example.helloandroid; //package는 하나의 클래스 안에서 같은 이름의 클래스들을 사용하기 위한 방법으로 사용한다.

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { //onCreate() 액티비티가 최초생성될 떄 호출되는 메소드
        super.onCreate(savedInstanceState); //super는 상위클래스를 의미하며 onCreate 메소드를 먼저 호출하여 먼저 실행되게 하고, 오버라이드된 메소드를 처리한다는 의미
        setContentView(R.layout.activity_main); //setContentView() 레이아웃의 xml파일의 내용을 파싱하여 뷰를 생성하고, 뷰에 정의된 속성을 설정한다.
    }
}
