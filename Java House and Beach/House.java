/*
Name: Noah Carmichael
Date: Dec 7, 2023
Description: Java graphics art, "House next to a Beach." When clouds move over a large enough portion of the sun, a shadow is cast over the landscape
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.util.Random;

public class House extends JPanel implements ActionListener {

    public static int width = 1250;
    public static int height = 750;

    private JFrame m_ParentFrame;
    private JFrame mainFrame;

    // cloud movement vars
    Timer tm = new Timer(5, this);
    int x = -208;
    int xadd = -1;
    int y = 100;
    int x2 = 100;
    int xadd2 = -1;
    int y2 = 120;
    int x3 = 450;
    int xadd3 = -3;
    int y3 = 80;
    int x4 = 800;
    int xadd4 = -2;
    int y4 = 130;

    // chimney smoke movement vars
    boolean doPlus = false;
    boolean doMinus = false;
    int xS = 885;
    int yadd = 1;
    int yS = 225;
    boolean doPlus2 = false;
    boolean doMinus2 = false;
    int xS2 = 850;
    int yS2 = 200;
    boolean doPlus3 = false;
    boolean doMinus3 = false;
    int xS3 = 855;
    int yS3 = 175;
    boolean doPlus4 = false;
    boolean doMinus4 = false;
    int xS4 = 850;
    int yS4 = 150;
    boolean doPlus5 = false;
    boolean doMinus5 = false;
    int xS5 = 853;
    int yS5 = 125;
    boolean doPlus6 = false;
    boolean doMinus6 = false;
    int xS6 = 850;
    int yS6 = 100;
    boolean doPlus7 = false;
    boolean doMinus7 = false;
    int xS7 = 858;
    int yS7 = 75;
    boolean doPlus8 = false;
    boolean doMinus8 = false;
    int xS8 = 850;
    int yS8 = 50;
    boolean doPlus9 = false;
    boolean doMinus9 = false;
    int xS9 = 855;
    int yS9 = 25;

    // shadow over sun var
    boolean shadow = false;

    House() {

        m_ParentFrame = new JFrame();
        m_ParentFrame.setSize(width, height); // canvas size
        m_ParentFrame.setLocation(50, 50); // where it pops up on screen
        m_ParentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m_ParentFrame.setTitle("House and Beach");
        this.setLocation(0, 0);
        m_ParentFrame.getContentPane().add(this);
        m_ParentFrame.setVisible(true);

    }

    public void paint(Graphics g) {
        // standard colours
        Color sky = new Color(135, 206, 235);
        Color ocean = new Color(17, 66, 145);
        Color sand = new Color(254, 217, 50);
        Color door = new Color(93, 41, 6);
        Color window = new Color(65, 253, 254);
        Color house = new Color(228, 213, 183);
        Color houseDark = new Color(196, 183, 155);
        Color roof = new Color(174, 44, 35);
        Color roofLight = new Color(227, 66, 54);
        Color roofLight2 = new Color(191, 56, 46);
        Color grass = new Color(124, 252, 0);
        Color grassShadow = new Color(98, 196, 2);
        Color smokeGray = new Color(211, 211, 211, 220);
        Color smokeWhite = new Color(245, 245, 245, 220);
        Color coconut = new Color(121, 81, 62);
        Color trunk = new Color(185, 157, 79);
        Color leaf = new Color(116, 181, 96);
        Color sunOuter = new Color(249, 215, 28, 110);
        Color sun = new Color(249, 215, 28);

        // if there is a cloud shadow, show darker colours
        Color oceanDark = new Color(12, 51, 112);
        Color sandDark = new Color(214, 183, 41);
        Color doorDark = new Color(64, 28, 4);
        Color windowDark = new Color(52, 206, 207);
        Color houseDarker = new Color(186, 174, 149);
        Color houseDarkerDarker = new Color(143, 133, 113);
        Color roofDark = new Color(133, 33, 27);
        Color roofLightDark = new Color(176, 52, 42);
        Color roofLight2Dark = new Color(148, 45, 37);
        Color grassDark = new Color(97, 196, 0);
        Color grassShadowDark = new Color(77, 156, 0);
        Color smokeGrayDark = new Color(179, 177, 177, 220);
        Color smokeWhiteDark = new Color(201, 199, 199, 220);
        Color coconutDark = new Color(92, 61, 47);
        Color trunkDark = new Color(138, 116, 56);
        Color leafDark = new Color(83, 130, 69);

        if (shadow == true) {
            ocean = oceanDark;
            sand = sandDark;
            door = doorDark;
            window = windowDark;
            house = houseDarker;
            houseDark = houseDarkerDarker;
            roof = roofDark;
            roofLight = roofLightDark;
            roofLight2 = roofLight2Dark;
            grass = grassDark;
            grassShadow = grassShadowDark;
            smokeGray = smokeGrayDark;
            smokeWhite = smokeWhiteDark;
            coconut = coconutDark;
            trunk = trunkDark;
            leaf = leafDark;
        }

        // sky
        g.setColor(sky);
        g.fillRect(0, 0, 1250, 750);

        // ocean
        g.setColor(ocean);
        g.fillRect(0, 255, 1250, 500);

        // wave crest
        g.fillArc(0, 250, 100, 10, 0, 180);
        g.setColor(sky);
        g.fillArc(100, 250, 100, 10, 0, -180);
        g.setColor(ocean);
        g.fillArc(200, 250, 100, 10, 0, 180);
        g.setColor(sky);
        g.fillArc(300, 250, 100, 10, 0, -180);
        g.setColor(ocean);
        g.fillArc(400, 250, 100, 10, 0, 180);
        g.setColor(sky);
        g.fillArc(500, 250, 100, 10, 0, -180);

        // sun
        g.setColor(sunOuter);
        g.fillOval(200, 50, 76, 76);
        g.setColor(sun);
        g.fillOval(208, 58, 60, 60);

        // clouds
        // 1
        g.setColor(Color.WHITE);
        g.fillOval(x, y, 100, 40);
        g.fillOval(x - 4, y - 15, 30, 50);
        g.fillOval(x + 20, y - 15, 20, 40);
        g.fillOval(x + 35, y - 25, 30, 60);
        g.fillOval(x + 60, y - 15, 40, 50);
        // 2
        g.fillOval(x2, y2, 100, 40);
        g.fillOval(x2 - 4, y2 - 15, 30, 50);
        g.fillOval(x2 + 20, y2 - 15, 20, 40);
        g.fillOval(x2 + 35, y2 - 25, 30, 60);
        g.fillOval(x2 + 60, y2 - 15, 40, 50);
        // 3
        g.fillOval(x3, y3, 100, 40);
        g.fillOval(x3 - 4, y3 - 15, 30, 50);
        g.fillOval(x3 + 20, y3 - 15, 20, 40);
        g.fillOval(x3 + 35, y3 - 25, 30, 60);
        g.fillOval(x3 + 60, y3 - 15, 40, 50);
        // 4
        g.fillOval(x4, y4, 100, 40);
        g.fillOval(x4 - 4, y4 - 15, 30, 50);
        g.fillOval(x4 + 20, y4 - 15, 20, 40);
        g.fillOval(x4 + 35, y4 - 25, 30, 60);
        g.fillOval(x4 + 60, y4 - 15, 40, 50);

        // wave foam
        g.setColor(Color.WHITE);
        int[] xcrest = {600, 180, 220, 605};
        int[] ycrest = {255, 750, 750, 255};
        g.fillPolygon(xcrest, ycrest, 4);

        // beach
        g.setColor(sand);
        int[] xsand = {605, 220, 1250, 1250};
        int[] ysand = {255, 750, 750, 255};
        g.fillPolygon(xsand, ysand, 4);

        // grass
        g.setColor(grass);
        int[] xgrass = {800, 570, 1250, 1250};
        int[] ygrass = {255, 750, 750, 255};
        g.fillPolygon(xgrass, ygrass, 4);

        // small piece for the roof that needs to be drawn before the house
        g.setColor(roof);
        int[] xroofS = {740, 760, 740};
        int[] yroofS = {340, 325, 310};
        g.fillPolygon(xroofS, yroofS, 3);
        g.setColor(Color.BLACK);
        g.drawPolygon(xroofS, yroofS, 3);

        // house
        g.setColor(house);
        int[] xhouse = {750, 900, 900, 825, 750};
        int[] yhouse = {460, 460, 330, 240, 330};
        g.fillPolygon(xhouse, yhouse, 5);

        // outline
        g.setColor(Color.BLACK);
        g.drawPolygon(xhouse, yhouse, 5);

        g.setColor(houseDark);
        int[] xside = {900, 940, 940, 900};
        int[] yside = {460, 370, 253, 330};
        g.fillPolygon(xside, yside, 4);
        g.setColor(Color.BLACK);
        g.drawPolygon(xside, yside, 4);

        // house shadow
        g.setColor(grassShadow);
        int[] xhouseShadow = {940, 900, 750, 860, 830, 855, 940, 1100, 1080, 1046, 1060};
        int[] yhouseShadow = {370, 460, 460, 590, 580, 606, 640, 525, 448, 423, 450};
        g.fillPolygon(xhouseShadow, yhouseShadow, 11);

        // roof
        g.setColor(roofLight);
        int[] xroof = {825, 740, 740, 825};
        int[] yroof = {255, 340, 310, 230};
        g.fillPolygon(xroof, yroof, 4);
        g.setColor(roofLight);
        int[] xroof2 = {825, 910, 910, 825};
        int[] yroof2 = {255, 340, 310, 230};
        g.fillPolygon(xroof2, yroof2, 4);
        int[] xroof3 = {825, 740, 740, 825, 910, 910};
        int[] yroof3 = {230, 310, 340, 255, 340, 310};
        g.setColor(Color.BLACK);
        g.drawPolygon(xroof3, yroof3, 6);
        g.setColor(roofLight2);
        int[] xroofside = {910, 825, 890, 945};
        int[] yroofside = {310, 230, 210, 255};
        g.fillPolygon(xroofside, yroofside, 4);
        g.setColor(Color.BLACK);
        g.drawPolygon(xroofside, yroofside, 4);
        g.setColor(roof);
        int[] xroofside2 = {910, 945, 945, 910};
        int[] yroofside2 = {310, 255, 270, 340};
        g.fillPolygon(xroofside2, yroofside2, 4);
        g.setColor(Color.BLACK);
        g.drawPolygon(xroofside2, yroofside2, 4);

        // chimney back
        g.setColor(roof);
        int[] xchimney3 = {900, 910, 895, 880};
        int[] ychimney3 = {220, 215, 215, 220};
        g.fillPolygon(xchimney3, ychimney3, 4);
        g.setColor(Color.BLACK);
        g.drawPolygon(xchimney3, ychimney3, 4);

        // chimney smoke
        // commented out ovals are the static version
        g.setColor(smokeGray);
//        g.fillOval(885, 200, 20, 20);
        g.fillOval(xS, yS, 20, 30);
        g.setColor(smokeWhite);
        g.fillOval(xS2, yS2, 20, 30);
//        g.fillOval(885, 210, 15, 15);
        g.setColor(smokeGray);
        g.fillOval(xS3, yS3, 20, 30);
//        g.fillOval(885, 180, 20, 25);
        g.setColor(smokeWhite);
        g.fillOval(xS4, yS4, 20, 30);
//        g.fillOval(883, 160, 25, 25);
        g.setColor(smokeGray);
        g.fillOval(xS5, yS5, 20, 30);
//        g.fillOval(880, 130, 27, 27);
        g.setColor(smokeWhite);
        g.fillOval(xS6, yS6, 20, 30);
//        g.fillOval(884, 90, 30, 33);
        g.setColor(smokeGray);
        g.fillOval(xS7, yS7, 20, 30);
//        g.fillOval(873, 40, 34, 36);
        g.setColor(smokeWhite);
        g.fillOval(xS8, yS8, 20, 30);
//        g.fillOval(880, -20, 35, 40);
        g.setColor(smokeGray);
        g.fillOval(xS9, yS9, 20, 30);

        // chimney front
        g.setColor(roofLight);
        int[] xchimney = {900, 900, 880, 880};
        int[] ychimney = {220, 260, 240, 220};
        g.fillPolygon(xchimney, ychimney, 4);
        g.setColor(Color.BLACK);
        g.drawPolygon(xchimney, ychimney, 4);

        // chimney side
        g.setColor(roofLight2);
        int[] xchimney2 = {900, 900, 910, 910};
        int[] ychimney2 = {220, 260, 250, 215};
        g.fillPolygon(xchimney2, ychimney2, 4);
        g.setColor(Color.BLACK);
        g.drawPolygon(xchimney2, ychimney2, 4);

        // door
        g.setColor(door);
        int[] xdoor = {840, 870, 870, 840};
        int[] ydoor = {460, 460, 400, 400};
        g.fillPolygon(xdoor, ydoor, 4);

        // door handle
        g.setColor(Color.BLACK);
        g.fillRect(860, 428, 5, 10);

        // window 1
        g.setColor(door);
        int[] xwindow1 = {780, 810, 810, 780};
        int[] ywindow1 = {430, 430, 400, 400};
        g.fillPolygon(xwindow1, ywindow1, 4);
        g.setColor(window);
        int[] xwindow11 = {784, 793, 793, 784};
        int[] ywindow11 = {413, 413, 404, 404};
        g.fillPolygon(xwindow11, ywindow11, 4);
        g.fillRect(797, 404, 9, 9);
        g.fillRect(797, 417, 9, 9);
        g.fillRect(784, 417, 9, 9);

        // window 2
        // top portion
        g.setColor(door);
        g.fillArc(780, 325, 90, 40, 0, 180);
        g.setColor(window);
        g.fillArc(790, 331, 70, 20, 0, 180);
        // rectangle portion
        g.setColor(door);
        g.fillRect(780, 345, 90, 20);
        g.setColor(window);
        g.fillRect(787, 348, 76, 12);

        // side window
        g.setColor(door);
        int[] xwindowside = {915, 925, 925, 915};
        int[] ywindowside = {400, 377, 352, 375};
        g.fillPolygon(xwindowside, ywindowside, 4);
        g.setColor(window);
        int[] xwindowside2 = {916, 919, 919, 916};
        int[] ywindowside2 = {385, 376, 371, 378};
        g.fillPolygon(xwindowside2, ywindowside2, 4);
        int[] xwindowside3 = {916, 919, 919, 916};
        int[] ywindowside3 = {395, 386, 381, 388};
        g.fillPolygon(xwindowside3, ywindowside3, 4);
        int[] xwindowside4 = {921, 923, 923, 921};
        int[] ywindowside4 = {384, 375, 370, 377};
        g.fillPolygon(xwindowside4, ywindowside4, 4);
        int[] xwindowside5 = {921, 923, 923, 921};
        int[] ywindowside5 = {373, 364, 359, 366};
        g.fillPolygon(xwindowside5, ywindowside5, 4);

        // tree
        g.setColor(trunk);
        int[] xtrunk = {680, 650, 665, 710};
        int[] ytrunk = {590, 490, 480, 585};
        g.fillPolygon(xtrunk, ytrunk, 4);
        // stripes
        g.setColor(Color.BLACK);
        int[] xtrunkStripe = {678, 704, 704, 678};
        int[] ytrunkStripe = {578, 570, 571, 579};
        g.fillPolygon(xtrunkStripe, ytrunkStripe, 4);
        int[] xtrunkStripe2 = {673, 699, 699, 673};
        int[] ytrunkStripe2 = {567, 559, 560, 568};
        g.fillPolygon(xtrunkStripe2, ytrunkStripe2, 4);
        int[] xtrunkStripe3 = {669, 694, 694, 669};
        int[] ytrunkStripe3 = {554, 547, 548, 555};
        g.fillPolygon(xtrunkStripe3, ytrunkStripe3, 4);
        int[] xtrunkStripe4 = {665, 689, 689, 665};
        int[] ytrunkStripe4 = {543, 536, 537, 544};
        g.fillPolygon(xtrunkStripe4, ytrunkStripe4, 4);
        int[] xtrunkStripe5 = {663, 684, 684, 663};
        int[] ytrunkStripe5 = {532, 526, 527, 533};
        g.fillPolygon(xtrunkStripe5, ytrunkStripe5, 4);
        int[] xtrunkStripe6 = {660, 680, 680, 660};
        int[] ytrunkStripe6 = {522, 516, 517, 523};
        g.fillPolygon(xtrunkStripe6, ytrunkStripe6, 4);
        // coconut
        g.setColor(coconut);
        g.fillOval(645, 495, 20, 20);
        g.setColor(Color.BLACK);
        g.drawOval(645, 495, 20, 20);
        g.setColor(coconut);
        g.fillOval(660, 493, 20, 20);
        g.setColor(Color.BLACK);
        g.drawOval(660, 493, 20, 20);
        // leaves
        g.setColor(leaf);
        int[] xleaf1 = {660, 620, 610, 595, 610, 650};
        int[] yleaf1 = {500, 520, 535, 520, 500, 485};
        g.fillPolygon(xleaf1, yleaf1, 6);
        int[] xleaf2 = {660, 600, 585, 585, 605, 660};
        int[] yleaf2 = {490, 475, 480, 465, 455, 475};
        g.fillPolygon(xleaf2, yleaf2, 6);
        int[] xleaf3 = {650, 645, 630, 650, 665, 665};
        int[] yleaf3 = {490, 450, 425, 425, 455, 485};
        g.fillPolygon(xleaf3, yleaf3, 6);
        int[] xleaf4 = {660, 687, 715, 705, 690, 665};
        int[] yleaf4 = {480, 455, 455, 470, 470, 495};
        g.fillPolygon(xleaf4, yleaf4, 6);
        int[] xleaf5 = {650, 705, 720, 710, 695, 660};
        int[] yleaf5 = {485, 490, 505, 520, 505, 500};
        g.fillPolygon(xleaf5, yleaf5, 6);

        // tree shadow
        g.setColor(grassShadow);
        int[] xtreeShadow = {680, 742, 695, 672, 672, 687, 750, 720, 740, 760, 820, 840, 780, 830, 848, 828, 815, 784, 800, 803, 782, 780, 770, 710};
        int[] ytreeShadow = {590, 673, 680, 668, 690, 698, 690, 730, 730, 700, 760, 760, 690, 691, 668, 660, 675, 675, 650, 630, 630, 650, 665, 585};
        g.fillPolygon(xtreeShadow, ytreeShadow, 24);
        g.fillOval(732, 659, 21, 21);
        g.fillOval(750, 653, 21, 21);

        tm.start();

    }

    public void actionPerformed(ActionEvent e) {
        Random rand = new Random();

        // cloud 1
        int cloudHeight = rand.nextInt(201);
        int cloudSpeed = rand.nextInt(3) + 1;
        x -= xadd;
        if (x <= -100) {
            xadd = cloudSpeed * (-1);
            y = cloudHeight;
        }
        if (x >= 1250) {
            x = -133;
        }

        // cloud 2
        int cloudHeight2 = rand.nextInt(201);
        int cloudSpeed2 = rand.nextInt(3) + 1;
        x2 -= xadd2;
        if (x2 <= -100) {
            xadd2 = cloudSpeed2 * (-1);
            y2 = cloudHeight2;
        }
        if (x2 >= 1250) {
            x2 = -133;
        }

        // cloud 3
        int cloudHeight3 = rand.nextInt(201);
        int cloudSpeed3 = rand.nextInt(3) + 1;
        x3 -= xadd3;
        if (x3 <= -100) {
            xadd3 = cloudSpeed3 * (-1);
            y3 = cloudHeight3;
        }
        if (x3 >= 1250) {
            x3 = -133;
        }

        // cloud 4
        int cloudHeight4 = rand.nextInt(201);
        int cloudSpeed4 = rand.nextInt(3) + 1;
        x4 -= xadd4;
        if (x4 <= -100) {
            xadd4 = cloudSpeed4 * (-1);
            y4 = cloudHeight4;
        }
        if (x4 >= 1250) {
            x4 = -133;
        }

        // smoke
        // 1
        yS -= yadd;
        if (yS < 190) {
            if (doPlus == true) {
                xS++;
            } else if (doMinus == true) {
                xS--;
            } else {
                xS++;
            }
        }
        if (yS <= -10) {
            xS = 885;
            yS = 220;
        }
        if (xS <= 870) {
            doPlus = true;
            doMinus = false;
        }
        if (xS >= 900) {
            doMinus = true;
            doPlus = false;
        }
        // 2
        yS2 -= yadd;
        if (yS2 < 190) {
            if (doPlus2 == true) {
                xS2++;
            } else if (doMinus2 == true) {
                xS2--;
            } else {
                xS2++;
            }
        }
        if (yS2 <= -10) {
            xS2 = 885;
            yS2 = 200;
        }
        if (xS2 <= 870) {
            doPlus2 = true;
            doMinus2 = false;
        }
        if (xS2 >= 900) {
            doMinus2 = true;
            doPlus2 = false;
        }
        // 3
        yS3 -= yadd;
        if (yS3 < 190) {
            if (doPlus3 == true) {
                xS3++;
            } else if (doMinus3 == true) {
                xS3--;
            } else {
                xS3++;
            }
        }
        if (yS3 <= -10) {
            xS3 = 885;
            yS3 = 200;
        }
        if (xS3 <= 870) {
            doPlus3 = true;
            doMinus3 = false;
        }
        if (xS3 >= 900) {
            doMinus3 = true;
            doPlus3 = false;
        }
        // 4
        yS4 -= yadd;
        if (yS4 < 190) {
            if (doPlus4 == true) {
                xS4++;
            } else if (doMinus4 == true) {
                xS4--;
            } else {
                xS4++;
            }
        }
        if (yS4 <= -10) {
            xS4 = 885;
            yS4 = 200;
        }
        if (xS4 <= 870) {
            doPlus4 = true;
            doMinus4 = false;
        }
        if (xS4 >= 900) {
            doMinus4 = true;
            doPlus4 = false;
        }
        // 5
        yS5 -= yadd;
        if (yS5 < 190) {
            if (doPlus5 == true) {
                xS5++;
            } else if (doMinus5 == true) {
                xS5--;
            } else {
                xS5++;
            }
        }
        if (yS5 <= -10) {
            xS5 = 885;
            yS5 = 200;
        }
        if (xS5 <= 870) {
            doPlus5 = true;
            doMinus5 = false;
        }
        if (xS5 >= 900) {
            doMinus5 = true;
            doPlus5 = false;
        }
        // 6
        yS6 -= yadd;
        if (yS6 < 190) {
            if (doPlus6 == true) {
                xS6++;
            } else if (doMinus6 == true) {
                xS6--;
            } else {
                xS6++;
            }
        }
        if (yS6 <= -10) {
            xS6 = 885;
            yS6 = 200;
        }
        if (xS6 <= 870) {
            doPlus6 = true;
            doMinus6 = false;
        }
        if (xS6 >= 900) {
            doMinus6 = true;
            doPlus6 = false;
        }
        // 7
        yS7 -= yadd;
        if (yS7 < 190) {
            if (doPlus7 == true) {
                xS7++;
            } else if (doMinus7 == true) {
                xS7--;
            } else {
                xS7++;
            }
        }
        if (yS7 <= -10) {
            xS7 = 885;
            yS7 = 200;
        }
        if (xS7 <= 870) {
            doPlus7 = true;
            doMinus7 = false;
        }
        if (xS7 >= 900) {
            doMinus7 = true;
            doPlus7 = false;
        }
        // 8
        yS8 -= yadd;
        if (yS8 < 190) {
            if (doPlus8 == true) {
                xS8++;
            } else if (doMinus8 == true) {
                xS8--;
            } else {
                xS8++;
            }
        }
        if (yS8 <= -10) {
            xS8 = 885;
            yS8 = 200;
        }
        if (xS8 <= 870) {
            doPlus8 = true;
            doMinus8 = false;
        }
        if (xS8 >= 900) {
            doMinus8 = true;
            doPlus8 = false;
        }
        // 9
        yS9 -= yadd;
        if (yS9 < 190) {
            if (doPlus9 == true) {
                xS9++;
            } else if (doMinus9 == true) {
                xS9--;
            } else {
                xS9++;
            }
        }
        if (yS9 <= -10) {
            xS9 = 885;
            yS9 = 200;
        }
        if (xS9 <= 870) {
            doPlus9 = true;
            doMinus9 = false;
        }
        if (xS9 >= 900) {
            doMinus9 = true;
            doPlus9 = false;
        }

        // check if clouds are causing shadow over sun, note that clouds are 100 wide and sunn is 76 wide
        if ((x > 100 && x < 276 && y > 44 && y < 114) || (x2 > 100 && x2 < 276 && y2 > 44 && y2 < 114) || (x3 > 100 && x3 < 276 && y3 > 44 && y3 < 114) || (x4 > 100 && x4 < 276 && y4 > 44 && y4 < 114)) {
            shadow = true;
        } else {
            shadow = false;
        }

        // reload the canvas
        repaint();
    }

    public static void main(String[] args) {
        House jd = new House();
    }

}
