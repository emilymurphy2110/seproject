package Core;

public class ClassSkills {
	
	private String className;
    private Skill[] requiredSkills;
	
    public ClassSkills(String title, Skill... skills) {
        this.className = title;
        this.requiredSkills = skills;
        
        new ClassSkills("Java Programming 1", Skill.IT);
        new ClassSkills("Java Programming 2", Skill.IT);
        new ClassSkills("PHP Programming", Skill.IT);
        new ClassSkills("Social Work", Skill.PSYCHOLOGY, Skill.SOCIOLOGY);
        new ClassSkills("Creative Writing", Skill.ENGLISH);
        new ClassSkills("Translation 1", Skill.ENGLISH, Skill.FRENCH, Skill.GERMAN);
        new ClassSkills("Translation 2", Skill.ENGLISH, Skill.ITALIAN, Skill.SPANISH);
        new ClassSkills("History of Art", Skill.ART, Skill.HISTORY);
        new ClassSkills("Scientific Methods", Skill.BIOLOGY, Skill.CHEMISTRY, Skill.PHYSICS);
        new ClassSkills("Introduction to Scottish Fiction", Skill.ENGLISH, Skill.GAELIC);
        new ClassSkills("Scottish History", Skill.GAELIC, Skill.HISTORY);
        new ClassSkills("Songwriting", Skill.ENGLISH, Skill.MUSIC);
        new ClassSkills("Sports Coaching", Skill.PE);
        new ClassSkills("Art and Design", Skill.ART, Skill.PHOTOGRAPHY);
        new ClassSkills("Primary Education", Skill.ART, Skill.BIOLOGY, Skill.CHEMISTRY, Skill.ENGLISH, Skill.FRENCH, Skill.HISTORY, Skill.MATHS, Skill.PHYSICS);
        new ClassSkills("Cookery", Skill.COOKING);
        new ClassSkills("Scottish Archaeology", Skill.GEOGRAPHY, Skill.GAELIC);
    }
}
