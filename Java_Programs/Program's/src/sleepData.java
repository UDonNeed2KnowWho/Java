package com.company;

public class sleepData {


    public static void printComplete(String unComplete) {

        //put the following into main when calling this function

/*        String template = "Start;End;Sleep quality;Time in bed;Wake up;Sleep Notes;Heart rate;Activity (steps)";

        String unComplete = "2019-01-29 22:52:48;2019-01-30 06:47:35;93%;7:54;:);Worked out;0;0\n" +
                "\n" +
                "2019-01-30 22:01:55;2019-01-31 05:58:28;91%;7:56;:|;Stressful day:Worked out;0;0\n" +
                "\n" +
                "2019-01-31 22:09:21;2019-02-01 06:50:49;100%;8:41;:);Ate late:Content:Woke up early:Worked out;0;0\n" +
                "\n" +
                "2019-02-01 23:57:44;2019-02-02 07:18:17;72%;7:20;:);Angry event:Ate late:Content:Stressful day;0;0\n" +
                "\n" +
                "2019-02-02 22:57:27;2019-02-03 07:40:03;99%;8:42;:);Content:Happy event:Late Snack:Woke up early;0;0\n" +
                "\n" +
                "2019-02-03 23:26:31;2019-02-04 07:00:23;74%;7:33;:|;Ate late:Happy;0;0\n" +
                "\n" +
                "2019-02-04 22:44:04;2019-02-05 06:13:03;66%;7:28;:);Ate late:Drank tea:Happy:Happy event:Read before sleep;0;0\n" +
                "\n" +
                "2019-02-05 22:47:18;2019-02-06 07:01:12;94%;8:13;:|;Content:Happy event:Late Snack:Woke up early:Worked out;0;0\n" +
                "\n" +
                "2019-02-06 22:29:08;2019-02-07 06:04:11;82%;7:35;:|;Angry event:Stressful day:Unhappy event ;0;0\n" +
                "\n" +
                "2019-02-07 22:53:25;2019-02-08 06:59:54;93%;8:06;:|;Angry event:Content:Late Snack:Woke up early;0;0";

        printComplete(unComplete, template);*/


        String [] arrOfStr = unComplete.split(";");

        for(String a:arrOfStr) {
            System.out.println(a);
        }

    }


}
