package com.zsnet.richeditorview;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.zsnet.richeditor.RichEditorView;

public class MainActivity extends AppCompatActivity {

    private RichEditorView richEditor;
    private TextView getHtml;
    private ImageButton undo;
    private ImageButton redo;
    private ImageButton bold;
    private ImageButton italic;
    private ImageButton subscript;
    private ImageButton superscript;
    private ImageButton strikethrough;
    private ImageButton underline;
    private ImageButton heading1;
    private ImageButton heading2;
    private ImageButton heading3;
    private ImageButton heading4;
    private ImageButton heading5;
    private ImageButton heading6;
    private ImageButton indent;
    private ImageButton outdent;
    private ImageButton alignLeft;
    private ImageButton alignCenter;
    private ImageButton alignRight;
    private ImageButton insertBullets;
    private ImageButton insertNumbers;
    private ImageButton blockquote;
    private ImageButton insertImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        setEvents();
    }

    private void initView() {
        richEditor = (RichEditorView) findViewById(R.id.rich_editor);
        getHtml = (TextView) findViewById(R.id.get_html);
        undo = (ImageButton) findViewById(R.id.undo);
        redo = (ImageButton) findViewById(R.id.redo);
        bold = (ImageButton) findViewById(R.id.bold);
        italic = (ImageButton) findViewById(R.id.italic);
        subscript = (ImageButton) findViewById(R.id.subscript);
        superscript = (ImageButton) findViewById(R.id.superscript);
        strikethrough = (ImageButton) findViewById(R.id.strikethrough);
        underline = (ImageButton) findViewById(R.id.underline);
        heading1 = (ImageButton) findViewById(R.id.heading1);
        heading2 = (ImageButton) findViewById(R.id.heading2);
        heading3 = (ImageButton) findViewById(R.id.heading3);
        heading4 = (ImageButton) findViewById(R.id.heading4);
        heading5 = (ImageButton) findViewById(R.id.heading5);
        heading6 = (ImageButton) findViewById(R.id.heading6);
        indent = (ImageButton) findViewById(R.id.indent);
        outdent = (ImageButton) findViewById(R.id.outdent);
        alignLeft = (ImageButton) findViewById(R.id.align_left);
        alignCenter = (ImageButton) findViewById(R.id.align_center);
        alignRight = (ImageButton) findViewById(R.id.align_right);
        insertBullets = (ImageButton) findViewById(R.id.insert_bullets);
        insertNumbers = (ImageButton) findViewById(R.id.insert_numbers);
        blockquote = (ImageButton) findViewById(R.id.blockquote);
        insertImage = (ImageButton) findViewById(R.id.insert_image);

        //初始化编辑高度
        richEditor.setEditorHeight(200);
        //初始化字体大小
        richEditor.setEditorFontSize(14);
        //初始化字体颜色
        richEditor.setEditorFontColor(Color.parseColor("#8A8A8A"));
        //初始化内边距
        richEditor.setPadding(25, 15, 25, 25);
        //设置编辑框背景，可以是网络图片 richEditor.setBackground("https://raw.githubusercontent.com/wasabeef/art/master/chip.jpg")
        richEditor.setBackgroundColor(Color.TRANSPARENT);
        //设置默认显示语句
        richEditor.setPlaceholder("请输入文稿内容... ...");
        //设置编辑器是否可用
        richEditor.setInputEnabled(true);
    }

    private void setEvents() {
        // 撤销当前标签状态下所有内容
        findViewById(R.id.undo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                richEditor.undo();
            }
        });
        // 恢复撤销的内容
        findViewById(R.id.redo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                richEditor.redo();
            }
        });
        // 加粗
        findViewById(R.id.bold).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //richEditor.focusEditor();
                richEditor.setBold();
            }
        });
        // 斜体
        findViewById(R.id.italic).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //richEditor.focusEditor();
                richEditor.setItalic();
            }
        });
        // 下角表
        findViewById(R.id.subscript).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //richEditor.focusEditor();
                if (richEditor.getHtml() == null) {
                    return;
                }
                richEditor.setSubscript();
            }
        });
        // 上角标
        findViewById(R.id.superscript).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //richEditor.focusEditor();
                if (richEditor.getHtml() == null) {
                    return;
                }
                richEditor.setSuperscript();
            }
        });
        // 删除线
        findViewById(R.id.strikethrough).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //richEditor.focusEditor();
                richEditor.setStrikeThrough();
            }
        });
        //下划线
        findViewById(R.id.underline).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //richEditor.focusEditor();
                richEditor.setUnderline();
            }
        });
        // 设置标题（1到6)
        findViewById(R.id.heading1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                richEditor.setHeading(1);
            }
        });

        findViewById(R.id.heading2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                richEditor.setHeading(2);
            }
        });

        findViewById(R.id.heading3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                richEditor.setHeading(3);
            }
        });

        findViewById(R.id.heading4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                richEditor.setHeading(4);
            }
        });

        findViewById(R.id.heading5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                richEditor.setHeading(5);
            }
        });

        findViewById(R.id.heading6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                richEditor.setHeading(6);
            }
        });
        // 向右缩进
        findViewById(R.id.indent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //richEditor.focusEditor();
                richEditor.setIndent();
            }
        });
        // 向左缩进
        findViewById(R.id.outdent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //richEditor.focusEditor();
                richEditor.setOutdent();
            }
        });
        //文章左对齐
        findViewById(R.id.align_left).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //richEditor.focusEditor();
                richEditor.setAlignLeft();
            }
        });
        // 文章居中对齐
        findViewById(R.id.align_center).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                richEditor.setAlignCenter();
            }
        });
        // 文章右对齐
        findViewById(R.id.align_right).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                richEditor.setAlignRight();
            }
        });
        // 无序排列
        findViewById(R.id.insert_bullets).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                richEditor.setBullets();
            }
        });
        // 有序排列
        findViewById(R.id.insert_numbers).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                richEditor.setNumbers();
            }
        });
        //引用
        findViewById(R.id.blockquote).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                richEditor.setBlockquote();
            }
        });
        // 插入图片
        findViewById(R.id.insert_image).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                richEditor.focusEditor();
            }
        });

        richEditor.setOnTextChangeListener(new RichEditorView.OnTextChangeListener() {
            @Override
            public void onTextChange(String text) {
                Log.e("Main", "输入的文字    " + text);
                String word = richEditor.getRemoveHtmlTagText();
                Log.e("Main", "输入的文字去掉标签    " + word);
            }
        });
    }
}