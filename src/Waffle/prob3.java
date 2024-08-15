package Waffle;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class prob3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer stn;

        int menuNum = Integer.parseInt(br.readLine());

        menuArr mr = new menuArr(menuNum);
        for (int i = 0; i < menuNum; i++) {
            stn = new StringTokenizer(br.readLine());
            int menuID = Integer.parseInt(stn.nextToken());
            float star = Float.parseFloat(stn.nextToken());
            int sikID = Integer.parseInt(stn.nextToken());
            int time = Integer.parseInt(stn.nextToken());
            String day = stn.nextToken();

            mr.addMenu(new menu(menuID, sikID, star, day, time));

        }

        int cusNum = Integer.parseInt(br.readLine());
        int orderNum;

        for (int i = 0; i < cusNum; i++) {
            orderNum = Integer.parseInt(br.readLine());
            for (int j = 0; j < orderNum; j++) {
                stn = new StringTokenizer(br.readLine());
                String ord = stn.nextToken();

                switch (ord) {
                    case "S":
                        String sign = stn.nextToken();
                        float req_float = Float.parseFloat(stn.nextToken());
                        mr.filterStar(req_float, sign);
                        break;
                    case "T":
                        stn.nextToken();
                        int time = Integer.parseInt(stn.nextToken());
                        mr.filterTime(time);
                        break;
                    case "D":
                        stn.nextToken();
                        String day = stn.nextToken();
                        mr.filterDay(day);
                        break;
                    case "R":
                        stn.nextToken();
                        int sikID = Integer.parseInt(stn.nextToken());
                        mr.filterRestau(sikID);
                        break;
                }
            }
            if (mr.ansMenu.isEmpty()) {
                sb.append(-1).append("\n");
                mr.clearAns();
            } else {
                mr.ansMenu.sort(new Comparator<menu>() {
                    @Override
                    public int compare(menu o1, menu o2) {
                        if (o1.menuID >= o2.menuID) {
                            return 1;
                        } else {
                            return -1;
                        }
                    }
                });
                for (int k = 0; k < mr.ansMenu.size(); k++) {
                    sb.append(mr.ansMenu.get(k).menuID).append(" ");
                }
                sb.append("\n");
                mr.clearAns();
            }


        }

        bw.write(sb.toString());

        br.close();
        bw.flush();
        bw.close();

    }

    public static class menu {
        int menuID;
        int sikID;
        float star;
        String Day;
        int time;

        public menu() {

        }

        public menu(int menuID, int sikID, float star, String day, int time) {
            this.menuID = menuID;
            this.sikID = sikID;
            this.star = star;
            this.Day = day;
            this.time = time;
        }
    }

    static class menuArr {
        ArrayList<menu> arr;
        ArrayList<menu> ansMenu;

        int num = 0;

        public menuArr(int num) {
            arr= new ArrayList<>(num);
            ansMenu = new ArrayList<>(num);
        }

        void addMenu(menu menu) {
            arr.add(num, menu);
            ansMenu.add(num, menu);
            this.num++;
        }

        void clearAns() {
            this.ansMenu = this.arr;
        }

        void filterStar(float req_star, String sign) {
            ArrayList<menu> tmp = new ArrayList<>(this.ansMenu.size());
            int size = this.ansMenu.size();
            menu curMenu;
            switch (sign) {
                case ">=" :
                    for (int i = 0; i < size; i++) {
                        curMenu = this.ansMenu.get(i);
                        if (curMenu.star >= req_star) {
                            tmp.add(curMenu);
                        }
                    } break;
                case "<=" :
                    for (int i = 0; i < size; i++) {
                        curMenu = this.ansMenu.get(i);
                        if (curMenu.star <= req_star) {
                            tmp.add(curMenu);
                        }
                    } break;
                case ">" :
                    for (int i = 0; i < size; i++) {
                        curMenu = this.ansMenu.get(i);
                        if (curMenu.star > req_star) {
                            tmp.add(curMenu);
                        }
                    } break;
                case "<" :
                    for (int i = 0; i < size; i++) {
                        curMenu = this.ansMenu.get(i);
                        if (curMenu.star < req_star) {
                            tmp.add(curMenu);
                        }
                    } break;
            }

            this.ansMenu = tmp;
        }

        void filterDay(String req_day) {
            int size = this.ansMenu.size();
            ArrayList<menu> tmp = new ArrayList<>(size);
            menu curMenu;
            for (int i = 0; i < size; i++) {
                curMenu = this.ansMenu.get(i);
                if (curMenu.Day.equals(req_day)) {
                    tmp.add(curMenu);
                }
            }

            this.ansMenu = tmp;
        }

        void filterRestau(int req_restau) {
            int size = this.ansMenu.size();
            ArrayList<menu> tmp = new ArrayList<>(size);
            menu curMenu;
            for (int i = 0; i < size; i++) {
                curMenu = this.ansMenu.get(i);
                if (curMenu.sikID == req_restau) {
                    tmp.add(curMenu);
                }
            }

            this.ansMenu = tmp;
        }

        void filterTime(int req_time) {
            int size = this.ansMenu.size();
            ArrayList<menu> tmp = new ArrayList<>(size);
            menu curMenu;
            for (int i = 0; i < size; i++) {
                curMenu = this.ansMenu.get(i);
                if (curMenu.time == req_time) {
                    tmp.add(curMenu);
                }
            }

            this.ansMenu = tmp;
        }


    }
}
