package kr.co.tjoeun.a20191201_03_kotlinsyntax

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lottoNumArr = ArrayList<Int>()


        lottoNumArr.add(10)
        lottoNumArr.add(42)
        lottoNumArr.add(17)
        lottoNumArr.add(0, 15)

        Log.d("로또번호입력한갯수", "${lottoNumArr.size} 개 입력됨")

        Log.d("42는몇번칸에?", "${lottoNumArr.indexOf(42)} 번 칸에 있음")

        Log.d("1번칸에는 뭐가들어있나?" , "${lottoNumArr.get(1)}")

//        42를 배열에서 빼내고싶다.
        lottoNumArr.remove(45)
        Log.d("로또번호입력한갯수", "${lottoNumArr.size} 개 입력됨")

//        맨 앞자료 삭제하고싶다.
        lottoNumArr.removeAt(0)

    }
}
