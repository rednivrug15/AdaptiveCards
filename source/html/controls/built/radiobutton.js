"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = Object.setPrototypeOf ||
        ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
        function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
Object.defineProperty(exports, "__esModule", { value: true });
var Constants = require("./constants");
var inputcontrol_1 = require("./inputcontrol");
var RadioButton = (function (_super) {
    __extends(RadioButton, _super);
    function RadioButton() {
        var _this = _super !== null && _super.apply(this, arguments) || this;
        _this._label = "";
        _this._checkboxElement = null;
        _this._spanElement = null;
        return _this;
    }
    RadioButton.createId = function () {
        var result = RadioButton.creationIndex;
        RadioButton.creationIndex++;
        return result;
    };
    RadioButton.prototype.changed = function () {
        if (this.onChange) {
            this.onChange(this);
        }
    };
    RadioButton.prototype.keyDown = function (e) {
        switch (e.keyCode) {
            case Constants.KEY_ENTER:
                this.isChecked = !this.isChecked;
                break;
        }
    };
    RadioButton.prototype.attach = function (rootElement) {
        var _this = this;
        _super.prototype.attach.call(this, rootElement);
        rootElement.className = "ms-ctrl ms-ctrl-radiobutton";
        rootElement.tabIndex = 0;
        var labelAttribute = rootElement.attributes["label"];
        if (labelAttribute) {
            this._label = labelAttribute.value;
        }
        var isCheckedAttribute = rootElement.attributes["ischecked"];
        if (isCheckedAttribute) {
            this._isChecked = isCheckedAttribute.value === "true";
        }
        this._checkboxElement = document.createElement("input");
        this._checkboxElement.id = "ms-ctrl-radio-" + RadioButton.createId();
        this._checkboxElement.type = "radio";
        this._checkboxElement.style.position = "absolute";
        this._checkboxElement.checked = this.isChecked;
        this._checkboxElement.onchange = function (e) { _this.changed(); };
        var groupNameAttribute = rootElement.attributes["groupname"];
        if (groupNameAttribute) {
            this._checkboxElement.name = groupNameAttribute.value;
        }
        var labelElement = document.createElement("label");
        labelElement.htmlFor = this._checkboxElement.id;
        this._spanElement = document.createElement("span");
        this._spanElement.innerText = this._label;
        labelElement.appendChild(this._spanElement);
        rootElement.innerHTML = "";
        rootElement.appendChild(this._checkboxElement);
        rootElement.appendChild(labelElement);
    };
    Object.defineProperty(RadioButton.prototype, "label", {
        get: function () {
            return this._label;
        },
        set: function (value) {
            this._label = value;
            if (this._spanElement) {
                this._spanElement.innerText = this._label;
            }
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(RadioButton.prototype, "isChecked", {
        get: function () {
            return this._isChecked;
        },
        set: function (value) {
            if (this._isChecked != value) {
                this._isChecked = value;
                if (this._checkboxElement) {
                    this._checkboxElement.checked = this._isChecked;
                }
                this.changed();
            }
        },
        enumerable: true,
        configurable: true
    });
    return RadioButton;
}(inputcontrol_1.InputControl));
// Used to generate unique Ids
RadioButton.creationIndex = 0;
exports.RadioButton = RadioButton;
//# sourceMappingURL=radiobutton.js.map