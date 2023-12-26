package com.example.fve;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnPushUps = findViewById(R.id.btnPushUps);
        btnPushUps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openExerciseActivity("https://www.youtube.com/shorts/d5r7FSbfqDg", "Отжимания - Упражнение для развития грудных мышц, трицепсов и передней дельтовидной мышцы. Выполняется в позиции лежа на полу, согнув руки в локтях и поднимая тело силой рук.");
            }
        });

        Button btnPullUps = findViewById(R.id.btnPullUps);
        btnPullUps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openExerciseActivity("https://www.youtube.com/shorts/CI2XU0I2Vzw", "Подтягивания - Упражнение для развития верхней части спины, бицепсов и предплечий. Выполняется, вися на горизонтальном перекладине, подтягивая тело вверх до тех пор, пока подбородок не достигнет уровня перекладины.");
            }
        });

        Button btnSquats = findViewById(R.id.btnSquats);
        btnSquats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openExerciseActivity("https://www.youtube.com/shorts/cobizDQ1lXE", "Приседания - Упражнение для тренировки бедер, ягодиц и мышц нижней части спины. Выполняется стоя, опуская тело вниз, как будто садишься на стул, с сохранением прямой спины и возвращением в исходное положение.");
            }
        });

        Button btnAbdmnlExrs = findViewById(R.id.btnAbdmnlExrs);
        btnAbdmnlExrs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openExerciseActivity("https://www.youtube.com/shorts/UKpM7bQwU6U", "Упражнения на пресс - Это группа упражнений для тренировки мышц живота. Включает в себя разнообразные движения, направленные на развитие прямых, боковых и глубоких мышц живота, такие как скручивания, планки, наклоны и др.");
            }
        });
    }

    private void openExerciseActivity(String videoUrl, String description) {
        Intent intent = new Intent(this, ExerciseActivity.class);
        intent.putExtra("videoUrl", videoUrl);
        intent.putExtra("description", description);
        startActivity(intent);
    }
}
