module cameo {
	requires static com.acromere.zenna;
	requires static maven.plugin.api;
	requires static maven.plugin.annotations;
	requires static maven.project;

	requires transitive javafx.controls;
	requires transitive javafx.graphics;

	requires com.acromere.zerra;

	exports com.acromere.cameo;
}