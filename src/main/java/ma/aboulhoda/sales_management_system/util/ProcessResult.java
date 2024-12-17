package ma.aboulhoda.sales_management_system.util;

import java.util.ArrayList;
import java.util.List;

public class ProcessResult {
    private int code;
    private List<String> infos;
    private List<String> warnings;
    private List<String> errors;
    private String message;
    private Object input;
    private Object output;

    public ProcessResult() {
    }

    public ProcessResult(int code) {
        this.code = code;
    }

    public ProcessResult(int code, String message) {
        this.code = code;
        this.message = message;
        if (code < 0) {
            getErrors().add(message);
        } else {
            getInfos().add(message);
        }
    }

    public Object getOutput() {
        return output;
    }

    public void setOutput(Object output) {
        this.output = output;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<String> getInfos() {
        if (infos == null) {
            infos = new ArrayList<String>();
        }
        return infos;
    }

    public void setInfos(List<String> infos) {
        if (infos == null) {
            infos = new ArrayList<String>();
        }
        this.infos = infos;
    }

    public List<String> getWarnings() {
        if (warnings == null) {
            warnings = new ArrayList<String>();
        }
        return warnings;
    }

    public void setWarnings(List<String> warnings) {
        if (warnings == null) {
            warnings = new ArrayList<String>();
        }
        this.warnings = warnings;
    }

    public List<String> getErrors() {
        if (errors == null) {
            errors = new ArrayList<String>();
        }
        return errors;
    }

    public void setErrors(List<String> errors) {
        if (errors == null) {
            errors = new ArrayList<String>();
        }
        this.errors = errors;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getInput() {
        return input;
    }

    public void setInput(Object input) {
        this.input = input;
    }
}
