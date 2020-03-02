package model;

import java.util.ArrayList;
import java.util.Arrays;

public enum ClassSkillsMatch {
	
	JAVA_PROGRAMMING_1(new Skill[] {Skill.IT}),
	JAVA_PROGRAMMING_2(new Skill[] {Skill.IT}),
	PHP_PROGRAMMING(new Skill[] {Skill.IT, Skill.HISTORY}),
	SOCIAL_WORK(new Skill[] {Skill.PSYCHOLOGY, Skill.SOCIOLOGY}),
	CREATIVE_WRITING(new Skill[] {Skill.ENGLISH}),
	TRANSLATION_1(new Skill[] {Skill.ENGLISH, Skill.FRENCH, Skill.GERMAN}),
	TRANSLATION_2(new Skill[] {Skill.ENGLISH, Skill.ITALIAN, Skill.SPANISH}),
	HISTORY_OF_ART(new Skill[] {Skill.ART, Skill.HISTORY}),
	SCIENTIFIC_METHODS(new Skill[] {Skill.BIOLOGY, Skill.CHEMISTRY, Skill.PHYSICS}),
	INTRODUCTION_TO_SCOTTISH_FICTION(new Skill[] {Skill.ENGLISH, Skill.GAELIC}),
	SCOTTISH_HISTORY(new Skill[] {Skill.GAELIC, Skill.HISTORY}),
	SONGWRITING(new Skill[] {Skill.ENGLISH, Skill.MUSIC}),
	SPORTS_COACHING(new Skill[] {Skill.PE}),
	ART_AND_DESIGN(new Skill[] {Skill.ART, Skill.PHOTOGRAPHY}),
	PRIMARY_EDUCATION(new Skill[] {Skill.ART, Skill.BIOLOGY, Skill.CHEMISTRY, Skill.ENGLISH, Skill.FRENCH, Skill.HISTORY, Skill.MATHS, Skill.PHYSICS}),
	COOKERY(new Skill[] {Skill.COOKING}),
	SCOTTISH_ARCHAEOLOGY(new Skill[] {Skill.GEOGRAPHY, Skill.GAELIC});


    private ArrayList<ClassSkillsMatch> skills = null;

	ClassSkillsMatch(Skill[] skills) {
        this.skills = new ArrayList(Arrays.asList(skills));
    }
}

