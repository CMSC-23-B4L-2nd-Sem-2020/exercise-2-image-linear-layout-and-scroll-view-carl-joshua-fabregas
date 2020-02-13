package com.example.whichservampareyou

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var servampImage : ImageView
    lateinit var servampText : TextView
    lateinit var servampName : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.change_button)
        val resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener{ resset() }
        rollButton.setOnClickListener { setter() }
        servampImage = findViewById(R.id.imageView)
        servampText = findViewById(R.id.description)
        servampName = findViewById(R.id.Title)

    }
    @SuppressLint("SetTextI18n")

    private  fun resset(){
        servampText.setText("")
        servampName.setText("Which Sevamp Are You?")
        servampImage.setImageResource(R.drawable.servamp)
    }
    @SuppressLint("SetTextI18n")
    private fun setter() {
        // Toast.makeText(this, "button clicked",
        //  Toast.LENGTH_SHORT).show()
        val randomInt = (1..10).random()

        val drawableResource = when (randomInt) {
            1 -> R.drawable.servamp_0
            2 -> R.drawable.servamp_1
            3 -> R.drawable.servamp_2
            4 -> R.drawable.servamp_3
            5 -> R.drawable.servamp_4
            6 -> R.drawable.servamp_5
            7 -> R.drawable.servamp_6
            8 -> R.drawable.servamp_7
            9 -> R.drawable.servamp_8
            else -> R.drawable.servamp_9
        }

        when (randomInt) {
            1 -> servampText.setText("Mahiro is a simple person who hates complicated things. He believes that everything can be simplified and tries to avoid overthinking the situation. Mahiro is a proactive kid that always offers his servers because he believes that 'Waiting for someone to come along is easy to say because you wont carry the blame if nobody did show up but waiting and deciding someone is too complicated'.\n Mahiro cherishes the few people who stuck to his side.")
            2 -> servampText.setText("Sleepy Ash also known as Kuro is the servamp of Sloth. Everything for him is a bothersome and would much prefer not doing anything. He's very dependent on other people's decision because he doesnt want to regret anything out of his own volition. \n Kuro avoids going outside and prefers to play videogames and eating instant noodles")
            3 -> servampText.setText("Doubt Doubt of Envy or Jeje is the servamp of Envy. Jeje has a quiet personality yet is roaring with intense emotions. Jeje is possessive and dangerous when he reaches his limit. \n Aggressive in making decisions and must always abide by the rules. A jealous type when it comes to people that matter to him")
            4 -> servampText.setText("Lawless of Greed with an alias 'Hyde' is the servamp of Greed. Once lost everything, Hyde is now determined to protect everything he has even if it meant getting hurt. He reaches for things that are remarkably outstanding and continues to reach for the best.\n Hyde is a kind person but cant settle down with what he currently has. He will discard people if they become no use to him or uncooperative")
            5 -> servampText.setText("Old Child of Pride or 'Hugh is the servamp of Pride. Hugh wasnt gifted with height however he makes it up with the confidence he posses. \n Hugh generally termed as a child because of his childish like behavior which matches his real name. Hugh is wise and plans out everything beforehand. His experience and planning is what gives him confidencce")
            6 -> servampText.setText("Sakuya Watanuki is a subclass of Who's coming of Melancholy. Sakuya faced a lot of family problems throughout his childhood and that built his character. \n Sakuya never tells a lie nor the truth, he preferes the gray area of the two sides. Despite not telling both truths and lies, he despises liars and manipulators. He will cutoff any relation to people even with just a small lie")
            7 -> servampText.setText("Litch Todoroki is a self proclaimed 'Angel'. Gifted with enormous talent for music, he is also blessed with looks, physic and intelligence. \n Litch despite having good qualities has a bad way of expressing his emotions to other people. He pushes people towards their limit until they realise the potential they have. ")
            8 -> servampText.setText("All of Love of Lust alsp known as Snow Lily is a kind hearted person. He always mind how people would feel and would protect them from being hurt even if it meant lying or manipulating them.\n Snow Lily is very playful and very obedient with people. He sees the beauty in everyone, in every decisions and in every action. He always takes care of everybody and gives love to all that was abandoned")
            9 -> servampText.setText("Who's coming of Melancholy or Tsubaki is the servamp of Melancholy. He quickly loses interest in everything despite showing great enthusiasm in it. \n Tsubaki has a very unstable emotion that can switch very quickly. He always laughs even in the smallest things and then gets saddened by it. He believes that nobody understands how he feels and nobody ever will but even with that belief, He keeps his friends close to him. A person of his word and never lies to people he found important")
            else -> servampText.setText("Mikuni Alicein is a mysterious individual. He appears and disappears in events very quickly. Even if he's not involved he always has an idea to what are happening in the situation.\n He's a seeker of knowledge and even taboo ideas. He loves cute things and is very playful. He uncovers the bad past in people and uses it to his advantage and in making quick and right decisions even if it may seem unjustified.")
        }

        when (randomInt) {
            1 -> servampName.setText("Mahiro Shirota")
            2 -> servampName.setText("Sleepy Ash")
            3 -> servampName.setText("Doubt Doubt of Envy")
            4 -> servampName.setText("Lawless of Greed")
            5 -> servampName.setText("Old Child of Pride")
            6 -> servampName.setText("Sakuya Watanuki")
            7 -> servampName.setText("Litch Todoroki")
            8 -> servampName.setText("All of Love of Lust")
            9 -> servampName.setText("Who's coming of Melancholy")
            else -> servampName.setText("Mikuni Alicein")
        }


        servampImage.setImageResource(drawableResource)
    }
}
