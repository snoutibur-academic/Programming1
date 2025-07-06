/* Last modified: 2023-02-10 */

import java.util.Random;

public class Madlibs {
    public static int getRandom() {
        Random r = new Random();
        return r.nextInt(19);
    }

    public static String getNoun() {
        String[] nouns = new String[] { "airplane", "computer", "sky", "rockets", "Joe's black market",
                "Joelle's Casino", "chainsaw", "derg", "Windows 10", "Arch (btw)", "iPhone",
                "Samsung Galaxy Fold 18 Ultra Big Edition", "2TB of RAM", "Squidward", "candy", "16", "Python",
                "10x developer", "ergo TKL keyboard", "robotic dog that runs TempleOS", "21" };
        return nouns[getRandom()];
    }

    public static String getVerb() {
        String[] verbs = new String[] { "installing viruses", "improving his Discord clone",
                "copy and pasting from StackOverflow", "trying to exit Vim", "downloading more RAM",
                "pirating open source software", "plugging something into the USB port on first try",
                "promoting LTTStore.com", "attending a Porter Robinson concert", "buying crap from the hardware store",
                "very patiently waiting", "programming a madlib generator in Java",
                "selling enterprise grade text documents", "eating like a normal person", "counting to 15",
                "donating to the Eclipse foundation", "sellin'", "giving away $19", "buying Ableton the next day" };
        return verbs[getRandom()];
    }

    public static String getAdj() {
        String[] adjs = new String[] { "highly efficient", "slow", "greeen", "ran by AI", "highly profitable",
                "unintelligent", "highly illegal", "peak regretful", "dreaded", "social",
                "12 times faster with 13% more wasted energy", "reek of agility", "broken", "unhealthy", "useless",
                "folded 17 times", "disrespectful", "positivity inducing", "entertainingly lame" };
        return adjs[getRandom()];
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hi mom! I'm Joe and I'm currently staring at a " + getNoun()
                + " with world class levels of regret. I've been procrastinating on " + getVerb()
                + " because that takes effort, and effort is outright " + getAdj()
                + ", so I'm not going to bother thankfully, because of new advancements in " + getNoun()
                + ", I could confidently say that I don't need to anymore. Now that's more time I could use to be"
                + getVerb() + "in a " + getAdj() + " way.");
        System.out.println("It is now the next day and I'm in a " + getNoun() + " trying to " + getNoun()
                + ", unfortunately, my mother decided to buy me a " + getNoun()
                + " to kickstart my million dollar side hustle of " + getVerb()
                + " for a 42.1% stake in equity. I suppose I should quit my job programming in Java"
                + " and start doing " + getNoun());
    }
}
