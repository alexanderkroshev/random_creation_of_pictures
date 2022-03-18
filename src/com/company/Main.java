package com.company;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Main {
    static int count = 0;

    static double face0, face1, face2, face3, face4;
    static double eye0, eye1, eye2;
    static double eye_color0, eye_color1, eye_color2, eye_color3, eye_color4, eye_color5, eye_color6, eye_color7, eye_color8, eye_color9, eye_color10;
    static double blush0, blush1, blush2, blush3, blush4, blush5;
    static double brow0, brow1, brow2;
    static double drop0, drop1;
    static double eye_dir0, eye_dir1, eye_dir2, eye_dir3;
    static double glass0, glass1, glass2, glass3, glass4, glass5, glass6, glass7, glass8, glass9;
    static double hair0, hair1, hair2, hair3, hair4, hair5, hair6, hair7, hair8, hair9, hair10, hair11, hair12, hair13, hair14, hair15;
    static double hair16, hair17, hair18, hair19, hair20, hair21, hair22, hair23, hair24, hair25, hair26;
    static double mouth0, mouth1, mouth2, mouth3, mouth4, mouth5, mouth6, mouth7, mouth8, mouth9;
    static double tool0, tool1, tool2, tool3, tool4, tool5, tool6, tool7, tool8, tool9;
    static double tool10, tool11, tool12, tool13, tool14, tool15, tool16, tool17, tool18, tool19, tool20;
    static double tool21, tool22, tool23, tool24, tool25, tool26, tool27, tool28, tool29, tool30, tool31;


    //probability


    public static void main(String[] args) throws IOException {
        Image image1 = new Image();
        image1.image();
        app();
    }

    public static void app() throws IOException {
        String strFace = "dark, tan, asian, pale, european";
        String[] faceStringArray = strFace.split(", ");

        String strBlush = "blush streak, a teardrop, cross-shaped blush, heart-shaped blush, blush lines (a curved line with pointy corners), blush lines (stripes)";
        String[] blushStringArray = strBlush.split(", ");

        String strHair = "black hair with a gray streak, black hair with a pink streak, gray hair, black hair with a rose, black curls with gray hair, green curls, a black bob haircut with a lotus, a bob haircut with blue gradient, a bob haircut with red gradient, green gradient hair, purple gradient hair, blue curls, light-blue hair, afro-curls, brown hair, a blonde bob haircut, blonde hair, a yellow bob haircut, yellow hair, a red bob haircut, red curls, a black bob haircut, black hair, a pink bob haircut, pink hair, a light-pink bob haircut, light-pink hair";
        String[] hairStringArray = strHair.split(", ");
        swap(hairStringArray, 3, 23);
        swap(hairStringArray, 6, 24);
        swap(hairStringArray, 23, 11);
        swap(hairStringArray, 24, 12);

        String strMouth = "a fan, a respirator with filter, a respirator, a black mask, a medical mask, a green tongue, a red tongue, a pink tongue, a pierced tongue, a regular tongue";
        String[] mouthStringArray = strMouth.split(", ");
        swap(mouthStringArray, 5, 8);
        swap(mouthStringArray, 6, 8);


        String strDrop = "drooling, drops of saliva around the mouth";
        String[] dropStringArray = strDrop.split(", ");

        String strEye = "eyes with arrows, round eyes, normal eyes";
        String[] eyeStringArray = strEye.split(", ");

        String strColor = "blue and green eye color, light green and blue eye color, yellow eye color, brown eye color, red eye color, rainbow eye color, green eye color, purple eye color, blue eye color, light green eye color, light-blue eye color";
        String[] colorStringArray = strColor.split(", ");
        swap(colorStringArray, 2, 3);
        swap(colorStringArray, 6, 7);

        String strDir = "cat eyes, a direct look, a cross-eyed look, looking up";
        String[] dirStringArray = strDir.split(", ");

        String strGlass = "heart-shaped glasses, pink glasses, small rainbow glasses, sunglasses, tortoiseshell glasses, rainbow glasses, red glasses, round glasses, golden glasses, smart-glasses";
        String[] glassStringArray = strGlass.split(", ");
        swap(glassStringArray, 8, 1);
        swap(glassStringArray, 3, 5);

        String strBrow = "one eyebrow is raised, crescent eyebrows, sad eyebrows";
        String[] browStringArray = strBrow.split(", ");

        String strTool = "a pet alien, a pet piggy, a pet Hachiko, a pet little fox, a pet red cat, a pet gray cat, a pet mouse, a pet panda, a pet bear, a pet bunny, emotion \"nya\", emotion \"!\", emotion \"smile\", emotion \"tongue\", a raspberry lollipop accessory, a lemon lollipop accessory, a heart-shaped lollipop accessory, a lollipop accessory, a popcorn accessory,  an iPhone Classic accessory, a golden iPhone Pro accessory, an iPhone Pro accessory, a blue iPhone accessory, a mint iPhone accessory, a black iPhone accessory, a red iPhone accessory, a bronze MacBook accessory, a space gray MacBook accessory, a silver MacBook accessory, a robot droid accessory, a headset accessory, a camera accessory";
        String[] toolStringArray = strTool.split(", ");
        swap(toolStringArray, 20, 1);

        Image.listWithPictures.sort((p1,p2)->p2.getProbability().compareTo(p1.getProbability()));

        try (FileWriter fileWriter = new FileWriter("C:\\другое\\javaКурс\\ARAProject\\готовые фотки\\achepixels\\фотоГотовые\\document.txt")) {
            for ( Picture picture : Image.listWithPictures ) {

                Integer faceRandom = picture.getFace();
                Integer hairRandom = picture.getHair();
                Integer mouthRandom = picture.getMouth();
                Integer dropRandom = picture.getDrop();
                Integer eyeRandom = picture.getEye();
                Integer eyeColorRandom = picture.getEye_color();
                Integer eyeDirRandom = picture.getEye_dir();
                Integer glassRandom = picture.getGlass();
                Integer toolRandom = picture.getTool();
                Integer browRandom = picture.getBrow();
                Integer blushRandom = picture.getBlush();

                BufferedImage faceImage = readImage("C:\\другое\\javaКурс\\ARAProject\\готовые фотки\\achepixels\\bigsize\\face" + faceRandom + ".png");
                BufferedImage hairImage = readImage("C:\\другое\\javaКурс\\ARAProject\\готовые фотки\\achepixels\\bigsize\\hair" + hairRandom + ".png");
                BufferedImage eyeImage = readImage("C:\\другое\\javaКурс\\ARAProject\\готовые фотки\\achepixels\\bigsize\\eye" + eyeRandom + ".png");
                BufferedImage eyeColorImage = readImage("C:\\другое\\javaКурс\\ARAProject\\готовые фотки\\achepixels\\bigsize\\eye_color" + eyeColorRandom + ".png");
                BufferedImage eyeDirImage = readImage("C:\\другое\\javaКурс\\ARAProject\\готовые фотки\\achepixels\\bigsize\\eye_dir" + eyeDirRandom + ".png");

                BufferedImage glassImage = readImage("C:\\другое\\javaКурс\\ARAProject\\готовые фотки\\achepixels\\bigsize\\glass" + glassRandom + ".png");
                BufferedImage mouthImage = readImage("C:\\другое\\javaКурс\\ARAProject\\готовые фотки\\achepixels\\bigsize\\mouth" + mouthRandom + ".png");
                BufferedImage browImage = readImage("C:\\другое\\javaКурс\\ARAProject\\готовые фотки\\achepixels\\bigsize\\brow" + browRandom + ".png");
                BufferedImage toolImage = readImage("C:\\другое\\javaКурс\\ARAProject\\готовые фотки\\achepixels\\bigsize\\tool" + toolRandom + ".png");

                BufferedImage dropImage = readImage("C:\\другое\\javaКурс\\ARAProject\\готовые фотки\\achepixels\\bigsize\\drop" + dropRandom + ".png");
                BufferedImage blushImage = readImage("C:\\другое\\javaКурс\\ARAProject\\готовые фотки\\achepixels\\bigsize\\blush" + blushRandom + ".png");



                //overlay can be or not
                if (picture.getBlushInt() == 1)
                    blushImage = null;

                if (picture.getDropInt() == 1)//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                    dropImage = null;

                if (picture.getToolInt() == 1)
                    toolImage = null;

                if (picture.getBrowInt() == 1)
                    browImage = null;

                if (picture.getGlassInt() == 1)
                    glassImage = null;



                BufferedImage tmp1 = overlayImages(faceImage, hairImage);
                BufferedImage tmp2 = overlayImages(tmp1, mouthImage);
                BufferedImage tmp3 = overlayImages(tmp2, dropImage);
                BufferedImage tmp4 = overlayImages(tmp3, eyeImage);

                BufferedImage tmp5 = overlayImages(tmp4, blushImage);
                BufferedImage tmp6 = overlayImages(tmp5, eyeImage);
                BufferedImage tmp7 = overlayImages(tmp6, eyeColorImage);
                BufferedImage tmp8 = overlayImages(tmp7, eyeDirImage);
                BufferedImage tmp9 = overlayImages(tmp8, glassImage);
                BufferedImage tmp10 = overlayImages(tmp9, browImage);
                BufferedImage tmp11 = overlayImages(tmp10, toolImage);


                ///////////////////////////////////////////////////////////////////////////////////////

                switch (glassRandom) {
                    case 0:
                        glass0++;
                        break;
                    case 1:
                        glass1++;
                        break;
                    case 2:
                        glass2++;
                        break;
                    case 3:
                        glass3++;
                        break;
                    case 4:
                        glass4++;
                        break;
                    case 5:
                        glass5++;
                        break;
                    case 6:
                        glass6++;
                        break;
                    case 7:
                        glass7++;
                        break;
                    case 8:
                        glass8++;
                        break;
                    case 9:
                        glass9++;
                        break;
                }


                switch (eyeRandom) {
                    case 0:
                        eye0++;
                        break;
                    case 1:
                        eye1++;
                        break;
                    case 2:
                        eye2++;
                        break;
                }


                switch (faceRandom) { //face
                    case 0:
                        face0++;
                        break;
                    case 1:
                        face1++;
                        break;
                    case 2:
                        face2++;
                        break;
                    case 3:
                        face3++;
                        break;
                    case 4:
                        face4++;
                        break;
                }

                switch (eyeColorRandom) {
                    case 0:
                        eye_color0++;
                        break;
                    case 1:
                        eye_color1++;
                        break;
                    case 2:
                        eye_color2++;
                        break;
                    case 3:
                        eye_color3++;
                        break;
                    case 4:
                        eye_color4++;
                        break;
                    case 5:
                        eye_color5++;
                        break;
                    case 6:
                        eye_color6++;
                        break;
                    case 7:
                        eye_color7++;
                        break;
                    case 8:
                        eye_color8++;
                        break;
                    case 9:
                        eye_color9++;
                        break;
                    case 10:
                        eye_color10++;
                        break;
                }

                switch (eyeDirRandom) {
                    case 0:
                        eye_dir0++;
                        break;
                    case 1:
                        eye_dir1++;
                        break;
                    case 2:
                        eye_dir2++;
                        break;
                    case 3:
                        eye_dir3++;
                        break;
                }


                if (blushImage != null) {
                    switch (blushRandom) {
                        case 0:
                            blush0++;
                            break;
                        case 1:
                            blush1++;
                            break;
                        case 2:
                            blush2++;
                            break;
                        case 3:
                            blush3++;
                            break;
                        case 4:
                            blush4++;
                            break;
                        case 5:
                            blush5++;
                            break;
                    }
                }

                if (browImage != null) {
                    switch (browRandom) {
                        case 0:
                            brow0++;
                            break;
                        case 1:
                            brow1++;
                            break;
                        case 2:
                            brow2++;
                            break;
                    }
                }


////////////////////////////////////
                switch (hairRandom) {  //hair
                    case 0:
                        hair0++;
                        break;
                    case 1:
                        hair1++;
                        break;
                    case 2:
                        hair2++;
                        break;
                    case 3:
                        hair3++;
                        break;
                    case 4:
                        hair4++;
                        break;
                    case 5:
                        hair5++;
                        break;
                    case 6:
                        hair6++;
                        break;
                    case 7:
                        hair7++;
                        break;
                    case 8:
                        hair8++;
                        break;
                    case 9:
                        hair9++;
                        break;
                    case 10:
                        hair10++;
                        break;
                    case 11:
                        hair11++;
                        break;
                    case 12:
                        hair12++;
                        break;
                    case 13:
                        hair13++;
                        break;
                    case 14:
                        hair14++;
                        break;
                    case 15:
                        hair15++;
                        break;
                    case 16:
                        hair16++;
                        break;
                    case 17:
                        hair17++;
                        break;
                    case 18:
                        hair18++;
                        break;
                    case 19:
                        hair19++;
                        break;
                    case 20:
                        hair20++;
                        break;
                    case 21:
                        hair21++;
                        break;
                    case 22:
                        hair22++;
                        break;
                    case 23:
                        hair23++;
                        break;
                    case 24:
                        hair24++;
                        break;
                    case 25:
                        hair25++;
                        break;
                    case 26:
                        hair26++;
                        break;
                }
                switch (mouthRandom) {  //mouth
                    case 0:
                        mouth0++;
                        break;
                    case 1:
                        mouth1++;
                        break;
                    case 2:
                        mouth2++;
                        break;
                    case 3:
                        mouth3++;
                        break;
                    case 4:
                        mouth4++;
                        break;
                    case 5:
                        mouth5++;
                        break;
                    case 6:
                        mouth6++;
                        break;
                    case 7:
                        mouth7++;
                        break;
                    case 8:
                        mouth8++;
                        break;
                    case 9:
                        mouth9++;
                        break;
                }

                if (dropImage != null) {
                    switch (dropRandom) {  //drop
                        case 0:
                            drop0++;
                            break;
                        case 1:
                            drop1++;
                            break;
                    }
                }

                if (toolImage != null) {
                    switch (toolRandom) {
                        case 0:
                            tool0++;
                            break;
                        case 1:
                            tool1++;
                            break;
                        case 2:
                            tool2++;
                            break;
                        case 3:
                            tool3++;
                            break;
                        case 4:
                            tool4++;
                            break;
                        case 5:
                            tool5++;
                            break;
                        case 6:
                            tool6++;
                            break;
                        case 7:
                            tool7++;
                            break;
                        case 8:
                            tool8++;
                            break;
                        case 9:
                            tool9++;
                            break;
                        case 10:
                            tool10++;
                            break;
                        case 11:
                            tool11++;
                            break;
                        case 12:
                            tool12++;
                            break;
                        case 13:
                            tool13++;
                            break;
                        case 14:
                            tool14++;
                            break;
                        case 15:
                            tool15++;
                            break;
                        case 16:
                            tool16++;
                            break;
                        case 17:
                            tool17++;
                            break;
                        case 18:
                            tool18++;
                            break;
                        case 19:
                            tool19++;
                            break;
                        case 20:
                            tool20++;
                            break;
                        case 21:
                            tool21++;
                            break;
                        case 22:
                            tool22++;
                            break;
                        case 23:
                            tool23++;
                            break;
                        case 24:
                            tool24++;
                            break;
                        case 25:
                            tool25++;
                            break;
                        case 26:
                            tool26++;
                            break;
                        case 27:
                            tool27++;
                            break;
                        case 28:
                            tool28++;
                            break;
                        case 29:
                            tool29++;
                            break;
                        case 30:
                            tool30++;
                            break;
                        case 31:
                            tool31++;
                            break;
                    }
                }

                if (tmp11 != null) {
                    writeImage(tmp11, "C:\\другое\\javaКурс\\ARAProject\\готовые фотки\\achepixels\\фотоГотовые\\Image" + count + ".png", "png");
                    System.out.println("Overlay Completed...");
                } else
                    System.out.println("Problem With Overlay...");



                String str = "\r\n" + "picture " + count + "\r\n" + "skin tone: " + faceStringArray[faceRandom] + "\r\n" + "hair: " + hairStringArray[hairRandom] + "\r\n" +
                        "mouth: " + mouthStringArray[mouthRandom] +
                        "\r\n" + "eyes: " + eyeStringArray[eyeRandom] + "\r\n" + "eye_color: " + colorStringArray[eyeColorRandom] +
                        "\r\n" + "eye_direction: " + dirStringArray[eyeDirRandom];
                fileWriter.write(str);
                if (dropImage != null)
                    fileWriter.write("\r\n" + "drooling: " + dropStringArray[dropRandom]);
                if (blushImage != null)
                    fileWriter.write("\r\n" + "blush: " + blushStringArray[blushRandom]);
                if (glassImage != null)
                    fileWriter.write("\r\n" + "glasses: " + glassStringArray[glassRandom]);
                if (browImage != null)
                    fileWriter.write("\r\n" + "eyebrows: " + browStringArray[browRandom]);
                if (toolImage != null)
                    fileWriter.write("\r\n" + "tool: " + toolStringArray[toolRandom]);

                Double prob = picture.getProbability();


                fileWriter.write("\r\n" + "Probability of picture: " + prob);
                if (count<200)
                    fileWriter.write("\r\n" + "price: " + 0.01);
                else if (count>=200 && count<400)
                    fileWriter.write("\r\n" + "price: " + 0.02);
                else if (count>=400 && count<600)
                    fileWriter.write("\r\n" + "price: " + 0.03);
                else if (count>=600 && count<800)
                    fileWriter.write("\r\n" + "price: " + 0.04);
                else if (count>=800)
                    fileWriter.write("\r\n" + "price: " + 0.05);
                fileWriter.write("\r\n" + "______________________");

                count++;
            }

            int size = Image.listWithPictures.size();
            fileWriter.write("\r\n" + "we used " + faceStringArray[0] + " " + (face0 * 100 / size) + " %" + "\r\n" +
                    "we used " + faceStringArray[1] + " " + (face1 * 100 / size) + " %" + "\r\n" +
                    "we used " + faceStringArray[2] + " " + (face2 * 100 / size) + " %" + "\r\n" +
                    "we used " + faceStringArray[3] + " " + (face3 * 100 / size) + " %" + "\r\n" +
                    "we used " + faceStringArray[4] + " " + (face4 * 100 / size) + " %" + "\r\n"
            );

            fileWriter.write("\r\n" + "we used " + hairStringArray[0] + " " + (hair0 * 100 / size) + " %" + "\r\n" +
                    "we used " + hairStringArray[1] + " " + (hair1 * 100 / size) + " %" + "\r\n" +
                    "we used " + hairStringArray[2] + " " + (hair2 * 100 / size) + " %" + "\r\n" +
                    "we used " + hairStringArray[3] + " " + (hair3 * 100 / size) + " %" + "\r\n" +
                    "we used " + hairStringArray[4] + " " + (hair4 * 100 / size) + " %" + "\r\n" +
                    "we used " + hairStringArray[5] + " " + (hair5 * 100 / size) + " %" + "\r\n" +
                    "we used " + hairStringArray[6] + " " + (hair6 * 100 /  size) + " %" + "\r\n" +
                    "we used " + hairStringArray[7] + " " + (hair7 * 100 /  size) + " %" + "\r\n" +
                    "we used " + hairStringArray[8] + " " + (hair8 * 100 /  size) + " %" + "\r\n" +
                    "we used " + hairStringArray[9] + " " + (hair9 * 100 /  size) + " %" + "\r\n" +
                    "we used " + hairStringArray[10] + " " + (hair10 * 100 /  size) + " %" + "\r\n" +
                    "we used " + hairStringArray[11] + " " + (hair11 * 100 /  size) + " %" + "\r\n" +
                    "we used " + hairStringArray[12] + " " + (hair12 * 100 /  size) + " %" + "\r\n" +
                    "we used " + hairStringArray[13] + " " + (hair13 * 100 /  size) + " %" + "\r\n" +
                    "we used " + hairStringArray[14] + " " + (hair14 * 100 /  size) + " %" + "\r\n" +
                    "we used " + hairStringArray[15] + " " + (hair15 * 100 /  size) + " %" + "\r\n" +
                    "we used " + hairStringArray[16] + " " + (hair16 * 100 /  size) + " %" + "\r\n" +
                    "we used " + hairStringArray[17] + " " + (hair17 * 100 /  size) + " %" + "\r\n" +
                    "we used " + hairStringArray[18] + " " + (hair18 * 100 /  size) + " %" + "\r\n" +
                    "we used " + hairStringArray[19] + " " + (hair19 * 100 /  size) + " %" + "\r\n" +
                    "we used " + hairStringArray[20] + " " + (hair20 * 100 /  size) + " %" + "\r\n" +
                    "we used " + hairStringArray[21] + " " + (hair21 * 100 /  size) + " %" + "\r\n" +
                    "we used " + hairStringArray[22] + " " + (hair22 * 100 /  size) + " %" + "\r\n" +
                    "we used " + hairStringArray[23] + " " + (hair23 * 100 /  size) + " %" + "\r\n" +
                    "we used " + hairStringArray[24] + " " + (hair24 * 100 /  size) + " %" + "\r\n" +
                    "we used " + hairStringArray[25] + " " + (hair25 * 100 /  size) + " %" + "\r\n" +
                    "we used " + hairStringArray[26] + " " + (hair26 * 100 /  size) + " %" + "\r\n"
            );

            fileWriter.write("\r\n" + "we used " + mouthStringArray[0] + " " + (mouth0 * 100 /  size) + " %" + "\r\n" +
                    "we used " + mouthStringArray[1] + " " + (mouth1 * 100 /  size) + " %" + "\r\n" +
                    "we used " + mouthStringArray[2] + " " + (mouth2 * 100 /  size) + " %" + "\r\n" +
                    "we used " + mouthStringArray[3] + " " + (mouth3 * 100 /  size) + " %" + "\r\n" +
                    "we used " + mouthStringArray[4] + " " + (mouth4 * 100 /  size) + " %" + "\r\n" +
                    "we used " + mouthStringArray[5] + " " + (mouth5 * 100 /  size) + " %" + "\r\n" +
                    "we used " + mouthStringArray[6] + " " + (mouth6 * 100 /  size) + " %" + "\r\n" +
                    "we used " + mouthStringArray[7] + " " + (mouth7 * 100 /  size) + " %" + "\r\n" +
                    "we used " + mouthStringArray[8] + " " + (mouth8 * 100 /  size) + " %" + "\r\n" +
                    "we used " + mouthStringArray[9] + " " + (mouth9 * 100 /  size) + " %" + "\r\n"
            );

            fileWriter.write("\r\n" + "we used " + blushStringArray[0] + " " + (blush0 * 100 / size) + " %" + "\r\n" +
                    "we used " + blushStringArray[1] + " " + (blush1 * 100 / size) + " %" + "\r\n" +
                    "we used " + blushStringArray[2] + " " + (blush2 * 100 / size) + " %" + "\r\n" +
                    "we used " + blushStringArray[3] + " " + (blush3 * 100 / size) + " %" + "\r\n" +
                    "we used " + blushStringArray[4] + " " + (blush4 * 100 / size) + " %" + "\r\n" +
                    "we used " + blushStringArray[5] + " " + (blush5 * 100 / size) + " %" + "\r\n"
            );

            fileWriter.write("\r\n" + "we used " + browStringArray[0] + " " + (brow0 * 100 /  size) + " %" + "\r\n" +
                    "we used " + browStringArray[1] + " " + (brow1 * 100 /  size) + " %" + "\r\n" +
                    "we used " + browStringArray[2] + " " + (brow2 * 100 /  size) + " %" + "\r\n"
            );

            fileWriter.write("\r\n" + "we used " + dropStringArray[0] + " " + (drop0 * 100 /  size) + " %" + "\r\n" +
                    "we used " + dropStringArray[1] + " " + (drop1 * 100 /  size) + " %" + "\r\n"
            );

            fileWriter.write("\r\n" +
                    "we used " + toolStringArray[0] + " " + (tool0 * 100 /  size) + " %" + "\r\n" +
                    "we used " + toolStringArray[1] + " " + (tool1 * 100 /  size) + " %" + "\r\n" +
                    "we used " + toolStringArray[2] + " " + (tool2 * 100 /  size) + " %" + "\r\n" +
                    "we used " + toolStringArray[3] + " " + (tool3 * 100 /  size) + " %" + "\r\n" +
                    "we used " + toolStringArray[4] + " " + (tool4 * 100 /  size) + " %" + "\r\n" +
                    "we used " + toolStringArray[5] + " " + (tool5 * 100 /  size) + " %" + "\r\n" +
                    "we used " + toolStringArray[6] + " " + (tool6 * 100 /  size) + " %" + "\r\n" +
                    "we used " + toolStringArray[7] + " " + (tool7 * 100 /  size) + " %" + "\r\n" +
                    "we used " + toolStringArray[8] + " " + (tool8 * 100 /  size) + " %" + "\r\n" +
                    "we used " + toolStringArray[9] + " " + (tool9 * 100 /  size) + " %" + "\r\n" +
                    "we used " + toolStringArray[10] + " " + (tool10 * 100 /  size) + " %" + "\r\n" +
                    "we used " + toolStringArray[11] + " " + (tool11 * 100 /  size) + " %" + "\r\n" +
                    "we used " + toolStringArray[12] + " " + (tool12 * 100 /  size) + " %" + "\r\n" +
                    "we used " + toolStringArray[13] + " " + (tool13 * 100 /  size) + " %" + "\r\n" +
                    "we used " + toolStringArray[14] + " " + (tool14 * 100 /  size) + " %" + "\r\n" +
                    "we used " + toolStringArray[15] + " " + (tool15 * 100 / size) + " %" + "\r\n" +
                    "we used " + toolStringArray[16] + " " + (tool16 * 100 /  size) + " %" + "\r\n" +
                    "we used " + toolStringArray[17] + " " + (tool17 * 100 /  size) + " %" + "\r\n" +
                    "we used " + toolStringArray[18] + " " + (tool18 * 100 /  size) + " %" + "\r\n" +
                    "we used " + toolStringArray[19] + " " + (tool19 * 100 /  size) + " %" + "\r\n" +
                    "we used " + toolStringArray[20] + " " + (tool20 * 100 /  size) + " %" + "\r\n" +
                    "we used " + toolStringArray[21] + " " + (tool21 * 100 /  size) + " %" + "\r\n" +
                    "we used " + toolStringArray[22] + " " + (tool22 * 100 /  size) + " %" + "\r\n" +
                    "we used " + toolStringArray[23] + " " + (tool23 * 100 /  size) + " %" + "\r\n" +
                    "we used " + toolStringArray[24] + " " + (tool24 * 100 /  size) + " %" + "\r\n" +
                    "we used " + toolStringArray[25] + " " + (tool25 * 100 /  size) + " %" + "\r\n" +
                    "we used " + toolStringArray[26] + " " + (tool26 * 100 /  size) + " %" + "\r\n" +
                    "we used " + toolStringArray[27] + " " + (tool27 * 100 /  size) + " %" + "\r\n" +
                    "we used " + toolStringArray[28] + " " + (tool28 * 100 /  size) + " %" + "\r\n" +
                    "we used " + toolStringArray[29] + " " + (tool29 * 100 /  size) + " %" + "\r\n" +
                    "we used " + toolStringArray[30] + " " + (tool30 * 100 /  size) + " %" + "\r\n" +
                    "we used " + toolStringArray[31] + " " + (tool31 * 100 /  size) + " %" + "\r\n"
            );

            fileWriter.write("\r\n" +
                    "we used " + colorStringArray[0] + " " + (eye_color0 * 100 /  size) + " %" + "\r\n" +
                    "we used " + colorStringArray[1] + " " + (eye_color1 * 100 /  size) + " %" + "\r\n" +
                    "we used " + colorStringArray[2] + " " + (eye_color2 * 100 /  size) + " %" + "\r\n" +
                    "we used " + colorStringArray[3] + " " + (eye_color3 * 100 /  size) + " %" + "\r\n" +
                    "we used " + colorStringArray[4] + " " + (eye_color4 * 100 /  size) + " %" + "\r\n" +
                    "we used " + colorStringArray[5] + " " + (eye_color5 * 100 /  size) + " %" + "\r\n" +
                    "we used " + colorStringArray[6] + " " + (eye_color6 * 100 /  size) + " %" + "\r\n" +
                    "we used " + colorStringArray[7] + " " + (eye_color7 * 100 /  size) + " %" + "\r\n" +
                    "we used " + colorStringArray[8] + " " + (eye_color8 * 100 /  size) + " %" + "\r\n" +
                    "we used " + colorStringArray[9] + " " + (eye_color9 * 100 /  size) + " %" + "\r\n" +
                    "we used " + colorStringArray[10] + " " + (eye_color10 * 100 /  size) + " %" + "\r\n"
            );

            fileWriter.write("\r\n" +
                    "we used " + dirStringArray[0] + " " + (eye_dir0 * 100 /  size) + " %" + "\r\n" +
                    "we used " + dirStringArray[1] + " " + (eye_dir1 * 100 /  size) + " %" + "\r\n" +
                    "we used " + dirStringArray[2] + " " + (eye_dir2 * 100 /  size) + " %" + "\r\n" +
                    "we used " + dirStringArray[3] + " " + (eye_dir3 * 100 /  size) + " %" + "\r\n"
            );

            fileWriter.write("\r\n" +
                    "we used " + eyeStringArray[0] + " " + (eye0 * 100 /  size) + " %" + "\r\n" +
                    "we used " + eyeStringArray[1] + " " + (eye1 * 100 /  size) + " %" + "\r\n" +
                    "we used " + eyeStringArray[2] + " " + (eye2 * 100 /  size) + " %" + "\r\n"
            );

            fileWriter.write("\r\n" +
                    "we used " + glassStringArray[0] + " " + (glass0 * 100 /  size) + " %" + "\r\n" +
                    "we used " + glassStringArray[1] + " " + (glass1 * 100 /  size) + " %" + "\r\n" +
                    "we used " + glassStringArray[2] + " " + (glass2 * 100 /  size) + " %" + "\r\n" +
                    "we used " + glassStringArray[3] + " " + (glass3 * 100 /  size) + " %" + "\r\n" +
                    "we used " + glassStringArray[4] + " " + (glass4 * 100 /  size) + " %" + "\r\n" +
                    "we used " + glassStringArray[5] + " " + (glass5 * 100 /  size) + " %" + "\r\n" +
                    "we used " + glassStringArray[6] + " " + (glass6 * 100 /  size) + " %" + "\r\n" +
                    "we used " + glassStringArray[7] + " " + (glass7 * 100 /  size) + " %" + "\r\n" +
                    "we used " + glassStringArray[8] + " " + (glass8 * 100 /  size) + " %" + "\r\n" +
                    "we used " + glassStringArray[9] + " " + (glass9 * 100 /  size) + " %" + "\r\n"
            );
        }
    }


        public static BufferedImage readImage (String fileLocation){
            BufferedImage img = null;
            try {
                img = ImageIO.read(new File(fileLocation));
            } catch (IOException e) {
                e.printStackTrace();
            }
            return img;
        }

        public static BufferedImage overlayImages (BufferedImage bgImage, BufferedImage fgImage){
            Graphics2D g = bgImage.createGraphics();
            g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
            g.drawImage(bgImage, 0, 0, null);
            g.drawImage(fgImage, 0, 0, null);
            g.dispose();
            return bgImage;
        }

        public static void swap (String[]arr,int i, int j){
            String tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }

        public static void writeImage (BufferedImage img, String fileLocation, String extension){
            try {
                BufferedImage bi = img;
                File outputfile = new File(fileLocation);
                ImageIO.write(bi, extension, outputfile);
            } catch (IOException e) {
                System.out.println("problem with overlay");
            }
        }
    }




