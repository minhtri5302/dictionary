package UI;

import UX.DictionaryCommandLine;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Navigation {
  private DictionaryCommandLine dictionaryCommandLine;

  public void setDictionaryCommandLine(DictionaryCommandLine dictionaryCommandLine) {
    this.dictionaryCommandLine = dictionaryCommandLine;
  }
  public DictionaryCommandLine getDictionaryCommandLine() {
    return this.dictionaryCommandLine;
  }
  public void goSearchWord(ActionEvent e) {
    try {
      Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
      FXMLLoader loader = new FXMLLoader();
      loader.setLocation(getClass().getResource("SearchWord.fxml"));
      Parent viewParent = loader.load();
      Scene scene = new Scene(viewParent);
      scene.getStylesheets().add
          ("/UI/button.css");
      SearchWordController controller = loader.getController();
      controller.setDictionaryCommandLine(dictionaryCommandLine);
      stage.setScene(scene);
    } catch (Exception ex) {
    }
  }

  public void goAddWord(ActionEvent e) {
    try {
      Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
      FXMLLoader loader = new FXMLLoader();
      loader.setLocation(getClass().getResource("AddWord.fxml"));
      Parent viewParent = loader.load();
      Scene scene = new Scene(viewParent);
      scene.getStylesheets().add
          ("/UI/button.css");
      AddWordController controller = loader.getController();
      controller.setDictionaryCommandLine(dictionaryCommandLine);
      stage.setScene(scene);
    } catch (Exception ex) {
    }
  }

  public void goDeleteWord(ActionEvent e) {
    try {
      Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
      FXMLLoader loader = new FXMLLoader();
      loader.setLocation(getClass().getResource("DeleteWord.fxml"));
      Parent viewParent = loader.load();
      Scene scene = new Scene(viewParent);
      scene.getStylesheets().add
          ("/UI/button.css");
      DeleteWordController controller = loader.getController();
      controller.setDictionaryCommandLine(dictionaryCommandLine);
      stage.setScene(scene);
    } catch (Exception ex) {
    }
  }

  public void goEditWord(ActionEvent e) {
    try {
      Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
      FXMLLoader loader = new FXMLLoader();
      loader.setLocation(getClass().getResource("EditWord.fxml"));
      Parent viewParent = loader.load();
      Scene scene = new Scene(viewParent);
      scene.getStylesheets().add
          ("/UI/button.css");
      EditWordController controller = loader.getController();
      controller.setDictionaryCommandLine(dictionaryCommandLine);
      stage.setScene(scene);
    } catch (Exception ex) {
    }
  }
  public void goMenu(ActionEvent e) {
    try {
      Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
      FXMLLoader loader = new FXMLLoader();
      loader.setLocation(getClass().getResource("Menu.fxml"));
      Parent viewParent = loader.load();
      Scene scene = new Scene(viewParent);
      scene.getStylesheets().add
          ("/UI/button.css");
      stage.setScene(scene);
    } catch (Exception ex) {
    }
  }
}