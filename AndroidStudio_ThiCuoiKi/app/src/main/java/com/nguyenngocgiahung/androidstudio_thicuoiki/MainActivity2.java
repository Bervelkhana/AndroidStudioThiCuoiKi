package com.nguyenngocgiahung.androidstudio_thicuoiki;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    private TextView tvQuestion;
    private TextView tvContentQuestion;
    private TextView tvDapAn1,tvDapAn2,tvDapAn3,tvDapAn4;

    private List<Question> mlistQuestion;
    private Question mQuestion;
    private int currentQuestion=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        unitUi();
        mlistQuestion = getListQuestion();
        if(mlistQuestion.isEmpty()){
            return;
        }
        setDataQuestion(mlistQuestion.get(currentQuestion));
    }

    private void setDataQuestion(Question question) {
        if(question == null) {
            return;
        }

        mQuestion=question;

        tvDapAn1.setBackgroundResource(R.drawable.btn);
        tvDapAn2.setBackgroundResource(R.drawable.btn);
        tvDapAn3.setBackgroundResource(R.drawable.btn);
        tvDapAn4.setBackgroundResource(R.drawable.btn);

        String titleQuestion = "Question " + question.getNumber();
        tvQuestion.setText(titleQuestion);
        tvContentQuestion.setText(question.getContent());
        tvDapAn1.setText(question.getListAnswer().get(0).getContent());
        tvDapAn2.setText(question.getListAnswer().get(1).getContent());
        tvDapAn3.setText(question.getListAnswer().get(2).getContent());
        tvDapAn4.setText(question.getListAnswer().get(3).getContent());

        tvDapAn1.setOnClickListener(this);
        tvDapAn2.setOnClickListener(this);
        tvDapAn3.setOnClickListener(this);
        tvDapAn4.setOnClickListener(this);
    }

    private void unitUi(){
        tvQuestion = findViewById(R.id.txvQuestion);
        tvContentQuestion = findViewById(R.id.txvContentQuestion);
        tvDapAn1 = findViewById(R.id.txvCauTraLoi1);
        tvDapAn2 = findViewById(R.id.txvCauTraLoi2);
        tvDapAn3 = findViewById(R.id.txvCauTraLoi3);
        tvDapAn4 = findViewById(R.id.txvCauTraLoi4);
    }

    private List<Question> getListQuestion(){
        List<Question> list = new ArrayList<>();

        List<Answer> answerList1 = new ArrayList<>();
        answerList1.add(new Answer("A.Alt + c",false));
        answerList1.add(new Answer("B.Alt + Enter",false));
        answerList1.add(new Answer("C.Alt + Esc",false));
        answerList1.add(new Answer("D.Alt + Insert",true));
        list.add(new Question(1,"Tổ hợp phím tắt để tạo constructor là gì ?",answerList1));

        List<Answer> answerList2 = new ArrayList<>();
        answerList2.add(new Answer("A.Image",false));
        answerList2.add(new Answer("B.ImageView",true));
        answerList2.add(new Answer("C.View",false));
        answerList2.add(new Answer("D.Img",false));
        list.add(new Question(2,"Thẻ code nào sau đây là để hiện một ảnh ?",answerList2));


        List<Answer> answerList3 = new ArrayList<>();
        answerList3.add(new Answer("A.id",false));
        answerList3.add(new Answer("B.view",false));
        answerList3.add(new Answer("C.drawable",false));
        answerList3.add(new Answer("D.A và C",true));
        list.add(new Question(3,"R.__.example câu trả lời nào dưới đây có thể điền vào chỗ trống",answerList3));

        List<Answer> answerList4 = new ArrayList<>();
        answerList4.add(new Answer("A.Ngôn ngữ Assembler",false));
        answerList4.add(new Answer("B.Ngôn ngữ C và Pascal",true));
        answerList4.add(new Answer("C.Ngôn ngữ Cobol",false));
        answerList4.add(new Answer("D.A, B và C.",false));
        list.add(new Question(4,"Ngôn ngữ lập trình nào dưới đây là ngôn ngữ lập trình có cấu trúc?",answerList4));


        List<Answer> answerList5 = new ArrayList<>();
        answerList5.add(new Answer("A.(a+=b)",false));
        answerList5.add(new Answer("B.(a*=b)",false));
        answerList5.add(new Answer("C.(a=b)",false));
        answerList5.add(new Answer("D.(a&=b)",true));
        list.add(new Question(5,"Giả sử a, b là hai số thực. Biểu thức nào dưới đây viết không đúng theo cú pháp của ngôn ngữ lập trình C:",answerList5));


        List<Answer> answerList6 = new ArrayList<>();
        answerList6.add(new Answer("A.Các kí tự số chữ số.",false));
        answerList6.add(new Answer("B.Các kí tự chữ cái.",false));
        answerList6.add(new Answer("C.Các kí tự đặc biệt.",false));
        answerList6.add(new Answer("D.Cả A,B và C",true));
        list.add(new Question(6,"Dữ liệu kí tự bao gồm :",answerList6));

        List<Answer> answerList7 = new ArrayList<>();
        answerList7.add(new Answer("A. C=24, dư 1",true));
        answerList7.add(new Answer("B. C=30",false));
        answerList7.add(new Answer("C. C=45",false));
        answerList7.add(new Answer("D. C=26, dư 2",false));
        list.add(new Question(7,"int a = 13;\n" +
                "int b = 5;\n" +
                "int c = a + 2 * a % b + 6;\n" +
                "Console.WriteLine(c);",answerList7));

        List<Answer> answerList8 = new ArrayList<>();
        answerList8.add(new Answer("A. .csharp",false));
        answerList8.add(new Answer("B. .cs",true));
        answerList8.add(new Answer("C. .c#",false));
        answerList8.add(new Answer("D. .cpp",false));
        list.add(new Question(8,"Which of the following is the extension used for C# files?",answerList8));

        List<Answer> answerList9 = new ArrayList<>();
        answerList9.add(new Answer("A. Main()",true));
        answerList9.add(new Answer("B. run()",false));
        answerList9.add(new Answer("C. start()",false));
        answerList9.add(new Answer("D. consoleMain()",false));
        list.add(new Question(9,"What is the main method of a C# console application called?",answerList9));

        List<Answer> answerList10 = new ArrayList<>();
        answerList10.add(new Answer("A. int",false));
        answerList10.add(new Answer("B. string",false));
        answerList10.add(new Answer("C. float",false));
        answerList10.add(new Answer("D. all of the above",true));
        list.add(new Question(10,"Which of the following is a valid C# data type?",answerList10));

        List<Answer> answerList11 = new ArrayList<>();
        answerList11.add(new Answer("A. //This is a comment",false));
        answerList11.add(new Answer("B. # This is a comment",false));
        answerList11.add(new Answer("C. /This is a comment/",false));
        answerList11.add(new Answer("D. // and /* */ can be used",true));
        list.add(new Question(11,"What is the correct way to write a comment in C#?",answerList11));

        List<Answer> answerList12 = new ArrayList<>();
        answerList12.add(new Answer("A. public",false));
        answerList12.add(new Answer("B. private",true));
        answerList12.add(new Answer("C. internal",false));
        answerList12.add(new Answer("D. protected",false));
        list.add(new Question(12,"Which access modifier would allow a variable to be accessed within the same file?",answerList12));

        List<Answer> answerList13 = new ArrayList<>();
        answerList13.add(new Answer("A. .java",true));
        answerList13.add(new Answer("B. .js",false));
        answerList13.add(new Answer("C. .jva",false));
        answerList13.add(new Answer("D. .class",false));
        list.add(new Question(13,"What is the extension used for Java files?",answerList13));

        List<Answer> answerList14 = new ArrayList<>();
        answerList14.add(new Answer("A. int",true));
        answerList14.add(new Answer("B. boolean",false));
        answerList14.add(new Answer("C. String",false));
        answerList14.add(new Answer("D. char",false));
        list.add(new Question(14,"Which of the following is a non-primitive data type in Java?",answerList14));

        List<Answer> answerList15 = new ArrayList<>();
        answerList15.add(new Answer("A. class",true));
        answerList15.add(new Answer("B. public ",false));
        answerList15.add(new Answer("C. int",false));
        answerList15.add(new Answer("D. my-variable",false));
        list.add(new Question(15,"Which of the following is a valid Java variable name?",answerList15));


        return list;
    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        if (id==R.id.txvCauTraLoi1){
            tvDapAn1.setBackgroundResource(R.drawable.cau_chon);
            checkAnswer(tvDapAn1, mQuestion,mQuestion.getListAnswer().get(0));
        }else if (id==R.id.txvCauTraLoi2) {
            tvDapAn2.setBackgroundResource(R.drawable.cau_chon);
            checkAnswer(tvDapAn2, mQuestion,mQuestion.getListAnswer().get(1));
        }else if (id==R.id.txvCauTraLoi3){
            tvDapAn3.setBackgroundResource(R.drawable.cau_chon);
            checkAnswer(tvDapAn3, mQuestion,mQuestion.getListAnswer().get(2));
        }else if (id==R.id.txvCauTraLoi4){
            tvDapAn4.setBackgroundResource(R.drawable.cau_chon);
            checkAnswer(tvDapAn4, mQuestion,mQuestion.getListAnswer().get(3));
        }
    }
    private void checkAnswer(TextView textView,Question question, Answer answer){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if(answer.isCorrect()){
                    textView.setBackgroundResource(R.drawable.cau_dung);
                    nextQuestion();
                }else {
                    textView.setBackgroundResource(R.drawable.cau_sai);
                    showAnswerCorrect(question);
                    gameOver();
                }
            }
        },1000);
    }

    private void gameOver() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                showDialog("GAME OVER. START AGAIN ?");
            }
        },1000);
    }

    private void showAnswerCorrect(Question question) {
        if (question==null||question.getListAnswer()==null||question.getListAnswer().isEmpty()){
            return;
        }

        if (question.getListAnswer().get(0).isCorrect()){
            tvDapAn1.setBackgroundResource(R.drawable.cau_dung);
        } else if (question.getListAnswer().get(1).isCorrect()) {
            tvDapAn2.setBackgroundResource(R.drawable.cau_dung);
        } else if (question.getListAnswer().get(2).isCorrect()) {
            tvDapAn3.setBackgroundResource(R.drawable.cau_dung);
        }else if (question.getListAnswer().get(3).isCorrect()){
            tvDapAn4.setBackgroundResource(R.drawable.cau_dung);
        }

    }

    private void nextQuestion() {
        if (currentQuestion == mlistQuestion.size()-1){
            showDialog("You Win");
        }else {
            currentQuestion++;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    setDataQuestion(mlistQuestion.get(currentQuestion));
                }
            },1000);
        }
    }

    private void showDialog(String message){
        AlertDialog.Builder builder= new AlertDialog.Builder(this);
        builder.setMessage(message);
        builder.setCancelable(false);

        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                currentQuestion=0;
                setDataQuestion(mlistQuestion.get(currentQuestion));
                dialog.dismiss();
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}