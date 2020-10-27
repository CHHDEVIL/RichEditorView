# RichEditor
Android富文本编辑器,本Demo只提供功能,至于页面UI图片需要您自己去设置

支持的功能
---
ps:以下属性请对照RichEditorView这个类里面的set方法
- [x] Bold 文字加粗
- [x] Italic 文字倾斜
- [x] Subscript 文字下标
- [x] Superscript 文字上标
- [x] Strikethrough 删除
- [x] Underline 强调线
- [x] Justify Left 文字左对齐
- [x] Justify Center 文字居中
- [x] Justify Right 文字右对齐
- [x] Blockquote 文字块
- [x] Heading 1 标题 1
- [x] Heading 2 标题 2
- [x] Heading 3 标题 3
- [x] Heading 4 标题 4
- [x] Heading 5 标题 5
- [x] Heading 6 标题 6
- [x] Undo 撤销
- [x] Redo 返回撤销
- [x] Indent 文字缩进
- [x] Outdent 文字突出
- [x] Insert Image 插入图像
- [x] Insert Youtube 插入 Youtube
- [x] Insert Video 插入视频
- [x] Insert Audio 插入音频
- [x] Insert Link 插入链接
- [x] Checkbox 复选框
- [x] Text Color 文本颜色
- [x] Text Background Color 文本背景颜色
- [x] Text Font Size 文本字体大小
- [x] Unordered List (Bullets) 无序列表(符号)
- [x] Ordered List (Numbers) 列表（数字）

编辑器的属性更改
---
- [x] Font Size 字体大小
- [x] Background Color 背景颜色
- [x] Width 宽度
- [x] Height 高度
- [x] Placeholder 占 位 符
- [x] Load CSS 加载 CSS样式
- [x] State Callback 状态回调

### 设置

##### Gradle
```groovy
dependencies {
  implementation 'jp.wasabeef:richeditor-android:2.x.x'
}
```
### 编辑器的默认设置
---

**高度**
```java
editor.setEditorHeight(200);
```

**字体**
```java
editor.setEditorFontSize(22);
editor.setEditorFontColor(Color.RED);
```

**背景**
```java
editor.setEditorBackgroundColor(Color.BLUE);
editor.setBackgroundColor(Color.BLUE);
editor.setBackgroundResource(R.drawable.bg);
editor.setBackground("https://raw.githubusercontent.com/wasabeef/art/master/chip.jpg");
```

**内填充**
```java
editor.setPadding(10, 10, 10, 10);
```

**占位符**
```java
editor.setPlaceholder("这里插入文本...");
```

**其他**  
请参考 [示例](https://github.com/CHHDEVIL/RichEditor/blob/main/app/src/main/java/com/zsnet/richeditorview/MainActivity.java)

### 内容可处理功能
---

**加粗**
```java
editor.setBold();
```

**倾斜**
```java
editor.setItalic();
```

**插入图像**
```java
editor.insertImage("https://raw.githubusercontent.com/wasabeef/art/master/twitter.png","twitter");
```

**文本更改侦听器**
```java
RichEditor editor = (RichEditor) findViewById(R.id.editor);
editor. setOnTextChangeListener(new RichEditor.OnTextChangeListener() {
  @Override
  public void onTextChange(String text) {
    // Do Something
     Log.d("RichEditor", "Preview " + text);
  }
});
```
