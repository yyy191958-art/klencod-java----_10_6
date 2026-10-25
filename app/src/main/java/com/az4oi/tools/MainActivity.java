package com.az4oi.tools;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.content.ClipboardManager;
import android.content.ClipData;
import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.ScrollView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ScrollView scrollView = new ScrollView(this);
        scrollView.setBackgroundColor(Color.parseColor("#121212"));

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER_HORIZONTAL);
        layout.setPadding(30, 30, 30, 30);

        TextView title = new TextView(this);
        title.setText("🔥 𓆩 𝑵𝑬𝑿𝑶 𓆪 أدوات بايثون 🔥");
        title.setTextColor(Color.parseColor("#00FF66"));
        title.setTextSize(20);
        title.setGravity(Gravity.CENTER);
        title.setPadding(0, 10, 0, 30);
        layout.addView(title);

        addToolButton(layout, "📋 1. أداة رشق انستغرام وتيك توك", getScript1());
        addToolButton(layout, "📋 2. أداة صيد حسابات فيسبوك", getScript2());
        addToolButton(layout, "📋 3. أداة صيد يوزرات تليجرام 🕷️", getScript3());
        addToolButton(layout, "📋 4. أداة لودو (صيد دائم)", getScript4());
        addToolButton(layout, "📋 5. أداة كار باكيج / صيد متطور", getScript5());
        addToolButton(layout, "📋 6. أداة فيسبوك ربط ألعاب (Yopmail)", getScript6());
        addToolButton(layout, "📋 7. أداة تويتر الشاملة", getScript7());
        addToolButton(layout, "📋 8. أداة إنستغرام وجيميل المدمجة", getScript8());
        addToolButton(layout, "📋 9. أداة صيد فيسبوك دومين hi2 / telegmail", getScript9());

        scrollView.addView(layout);
        setContentView(scrollView);
    }

    private void addToolButton(LinearLayout parent, String buttonText, final String scriptContent) {
        TextView btn = new TextView(this);
        btn.setText(buttonText);
        btn.setTextColor(Color.WHITE);
        btn.setTextSize(15);
        btn.setGravity(Gravity.CENTER);
        btn.setPadding(20, 30, 20, 30);
        btn.setBackgroundColor(Color.parseColor("#1E1E1E"));

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT, 
            LinearLayout.LayoutParams.WRAP_CONTENT
        );
        params.setMargins(0, 10, 0, 10);
        btn.setLayoutParams(params);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                copyToClipboard("PythonScript", scriptContent);
                Toast.makeText(getApplicationContext(), "تم نسخ السكربت الكامل بنجاح 📋", Toast.LENGTH_SHORT).show();
            }
        });

        parent.addView(btn);
    }

    private void copyToClipboard(String label, String text) {
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText(label, text);
        if (clipboard != null) {
            clipboard.setPrimaryClip(clip);
        }
    }

    // --- 1. أداة الرشق ---
    private String getScript1() {
        return "import requests\n" +
               "from user_agent import generate_user_agent as ua\n" +
               "import webbrowser\n" +
               "webbrowser.open('https://t.me/+-RI8FhLv6s82ZGY8')\n" +
               "import os\n" +
               "print('=== اداة رشق مدفوعة ===')\n";
    }

    // --- 2. أداة صيد فيسبوك ---
    private String getScript2() {
        return "import requests, json\n" +
               "import random\n" +
               "import time\n" +
               "from threading import Thread\n" +
               "import sys,os\n" +
               "import webbrowser\n" +
               "webbrowser.open('https://t.me/aaaa1qaq')\n" +
               "print('=== أداة فحص حسابات الفيسبوك ===')\n";
    }

    // --- 3. أداة يوزرات تليجرام ---
    private String getScript3() {
        return "import aiohttp\n" +
               "import asyncio\n" +
               "import random\n" +
               "import string\n" +
               "import os\n" +
               "print('=== Telegram Username Hunter ===')\n";
    }

    // --- 4. أداة لودو ---
    private String getScript4() {
        return "import webbrowser\n" +
               "try:\n    webbrowser.open('https://t.me/XXPytho')\n" +
               "except Exception:\n    pass\n" +
               "import random, requests, telebot, time, sys\n" +
               "print('=== أداة صيد لودو ===')\n";
    }

    // --- 5. أداة كار باكيج ---
    private String getScript5() {
        return "import webbrowser\n" +
               "try:\n    webbrowser.open('https://t.me/XXPytho')\n" +
               "except Exception:\n    pass\n" +
               "import random, requests, telebot, time, sys\n" +
               "print('=== أداة كار باكيج ===')\n";
    }

    // --- 6. فيسبوك ربط ألعاب ---
    private String getScript6() {
        return "import random\n" +
               "import requests\n" +
               "import os\n" +
               "import sys\n" +
               "import webbrowser\n" +
               "from concurrent.futures import ThreadPoolExecutor\n" +
               "webbrowser.open('https://t.me/python10xa')\n" +
               "print('=== فيسبوك ربط ألعاب ===')\n";
    }

    // --- 7. تويتر ---
    private String getScript7() {
        return "import builtins, sys, time, random, string, threading, requests, re, json, os\n" +
               "print('=== أداة تويتر ===')\n";
    }

    // --- 8. إنستغرام وجيميل ---
    private String getScript8() {
        return "import requests, random, json, time, webbrowser, string, threading, os, base64, secrets, httpx\n" +
               "from concurrent.futures import ThreadPoolExecutor\n" +
               "print('=== إنستغرام وجيميل المدمجة ===')\n";
    }

    // --- 9. ببجي / صيد hi2 ---
    private String getScript9() {
        return "import os, sys, time, json, uuid, random, string, secrets, base64, threading, re\n" +
               "from datetime import datetime\n" +
               "import requests\n" +
               "print('=== أداة فحص hi2 / telegmail ===')\n";
    }
}
