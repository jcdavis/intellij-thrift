package com.intellij.plugins.thrift.config.target;

import com.intellij.openapi.util.IconLoader;

import javax.swing.*;

/**
 * 26.06.2014 14:38
 *
 * @author xBlackCat
 */
public enum GeneratorType {
  AS3("as3", "/fileTypes/as.png") {
    @Override
    public AS3 create() {
      return new AS3();
    }
  },
  CGlib("c_glib", "/icons/types/cglib.png"),
  Cocoa("cocoa", "/icons/types/cocoa.png") {
    @Override
    public Cocoa create() {
      return new Cocoa();
    }
  },
  Cpp("cpp", "/icons/types/c_file.gif") {
    @Override
    public Cpp create() {
      return new Cpp();
    }
  },
  CSharp("csharp", "/icons/types/dotnet.png") {
    @Override
    public CSharp create() {
      return new CSharp();
    }
  },
  D("d", "/icons/types/d.png"),
  Delphi("delphi", "/icons/types/pascal.png") {
    @Override
    public Delphi create() {
      return new Delphi();
    }
  },
  Erlang("erl", "/icons/types/erlang.png"),
  Go("go", "/icons/types/go.png") {
    @Override
    public Go create() {
      return new Go();
    }
  },
  Graphviz("gv", "/icons/types/graphviz.png") {
    @Override
    public Graphviz create() {
      return new Graphviz();
    }
  },
  Haskell("hs", "/icons/types/haskell.png"),
  HTML("html", "/fileTypes/html.png") {
    @Override
    public HTML create() {
      return new HTML();
    }
  },
  Java("java", "/fileTypes/java.png") {
    @Override
    public Java create() {
      return new Java();
    }
  },
  JavaME("javame", "/fileTypes/java.png"),
  JavaScript("js", "/fileTypes/javaScript.png") {
    @Override
    public Javascript create() {
      return new Javascript();
    }
  },
  OCaml("ocaml", "/icons/types/ocaml.png"),
  Perl("perl", "/icons/types/perl.png"),
  PHP("php", "/icons/types/php-icon.png") {
    @Override
    public PHP create() {
      return new PHP();
    }
  },
  Python("py", "/icons/types/pythonFile.png") {
    @Override
    public Python create() {
      return new Python();
    }
  },
  Ruby("rb", "/icons/types/ruby_file.png") {
    @Override
    public Ruby create() {
      return new Ruby();
    }
  },
  Smalltalk("st", "/icons/types/smalltalk.png"),
  XSD("xsd", "/fileTypes/xsdFile.png"),
  //---
  ;
  private final Icon myIcon;
  protected final String name;

  GeneratorType(String name, final String iconName) {
    this.name = name;
    myIcon = new IconLoader.LazyIcon() {
      @Override
      protected Icon compute() {
        return IconLoader.getIcon(iconName);
      }
    };
  }

  public Generator create() {
    return new Generator(this);
  }

  public Icon getIcon() {
    return myIcon;
  }
}
