function lifeInWeeks(age) {
    var remainingYear = 90-age;

    remainingYear = 90 - age;
    var days = remainingYear * 365;
    var weeks = remainigYear * 52;
    var months = remainingYear * 12;

    console.log("Remaining years : " + remainingYear + " remaining days " +days+ " remaining months " +months+ " remaining weeks " +weeks);
}
lifeInWeeks(56);