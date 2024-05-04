public class Notes {
  private int number;
  private String code;
  private int note;
  Notes(int number, String code, int note){
    this.number = number;
    this.code = code;
    this.note = note;
  }

  public int getNumber() {
    return number;
  }

  public String getCode() {
    return code;
  }

  public int getNote() {
    return note;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public void setNote(int note) {
    this.note = note;
  }
}
