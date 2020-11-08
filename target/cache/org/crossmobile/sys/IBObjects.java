/* AUTO-GENERATED FILE. DO NOT MODIFY.
 *
 * This file was created automatically by the CrossMobile tools.
 * It should not be modified by hand.
 */

package org.crossmobile.sys;

import crossmobile.ios.uikit.*;
import crossmobile.ios.foundation.*;
import crossmobile.ios.coregraphics.*;
import java.util.*;

public class IBObjects {
  public static class Main_storyboard extends UIStoryboard {
    public Main_storyboard() {
      setStoryBoard(this);
    }
    private static Main_storyboard Main_storyboard_singleton;
    private void setStoryBoard(Main_storyboard storyboard) {
      Main_storyboard_singleton = this;
    }
    public static Main_storyboard get_Storyboard() {
      return Main_storyboard_singleton;
    }
    @Override
    public UIViewController instantiateInitialViewController() {
      return new _MiBAk3fe();
    }
    public final Object get_nqbfbuCl() {
      if(_nqbfbuCl == null) {
        _nqbfbuCl = new Object();
      }
      return _nqbfbuCl;
    }
    public final void set_nqbfbuCl(Object _nqbfbuCl) {
      this._nqbfbuCl = (Object)_nqbfbuCl;
    }
    public final void init_nqbfbuCl() {
    }
    public static class _deRJlpf6 extends UIViewController {
      private UIViewController get_deRJlpf6() {
        return this;
      }
      
      protected void loadViewFromStoryboard() {
        setView(get_cY8K7xLJ());
        init_late_cY8K7xLJ();
        view().layoutSubviews();
      }
      public _deRJlpf6() {
        _0K26Pfsn = topLayoutGuide();
        _WVDz9aCv = bottomLayoutGuide();
        org.crossmobile.build.StoryBoardBinder.bindStoryboardWithViewController(_deRJlpf6.this, get_Storyboard());

      }
    public final UIView get_cY8K7xLJ() {
      if(_cY8K7xLJ == null) {
        _cY8K7xLJ = new UIView();
        _cY8K7xLJ.setContentMode(0);
        _cY8K7xLJ.setFrame(new CGRect(0.0f, 0.0f, 375.0f, 667.0f));
        _cY8K7xLJ.setBackgroundColor(UIColor.colorWithWhiteAlpha(1.0f, 1.0f));
        _cY8K7xLJ.setAutoresizingMask(UIViewAutoresizing.FlexibleWidth | UIViewAutoresizing.FlexibleHeight);
        _cY8K7xLJ.addSubview(get_L16kYQkd());
        _cY8K7xLJ.addSubview(get_Ofn3zBsV());
        init_late_L16kYQkd();
        init_late_Ofn3zBsV();
      }
      return _cY8K7xLJ;
    }
    public final UIImageView get_L16kYQkd() {
      if(_L16kYQkd == null) {
        _L16kYQkd = new UIImageView();
        _L16kYQkd.setUserInteractionEnabled(false);
        _L16kYQkd.setContentMode(0);
        _L16kYQkd.setTranslatesAutoresizingMaskIntoConstraints(false);
        _L16kYQkd.setFrame(new CGRect(61.0f, 56.0f, 250.0f, 348.0f));
        _L16kYQkd.setAutoresizingMask(UIViewAutoresizing.FlexibleLeftMargin | UIViewAutoresizing.FlexibleRightMargin | UIViewAutoresizing.FlexibleBottomMargin);
        _L16kYQkd.setImage(UIImage.imageNamed("logo.png"));
      }
      return _L16kYQkd;
    }
    public final UILabel get_Ofn3zBsV() {
      if(_Ofn3zBsV == null) {
        _Ofn3zBsV = new UILabel();
        _Ofn3zBsV.setOpaque(false);
        _Ofn3zBsV.setUserInteractionEnabled(false);
        _Ofn3zBsV.setContentMode(7);
        _Ofn3zBsV.setTranslatesAutoresizingMaskIntoConstraints(false);
        _Ofn3zBsV.setFrame(new CGRect(0.0f, 491.0f, 375.0f, 43.0f));
        _Ofn3zBsV.setAutoresizingMask(UIViewAutoresizing.FlexibleWidth | UIViewAutoresizing.FlexibleBottomMargin);
        _Ofn3zBsV.setText("   Hello World!!");
        _Ofn3zBsV.setTextAlignment(NSTextAlignment.Center);
        _Ofn3zBsV.setFont(UIFont.systemFontOfSize(17.0f));
        _Ofn3zBsV.setAdjustsFontSizeToFitWidth(false);
        _Ofn3zBsV.setBaselineAdjustment(UIBaselineAdjustment.AlignBaselines);
      }
      return _Ofn3zBsV;
    }
    public final void init_late_cY8K7xLJ() {
    }
    public final void init_late_L16kYQkd() {
        _L16kYQkd.setContentHuggingPriority(251.0f, UILayoutConstraintAxis.Vertical);
        _L16kYQkd.setContentHuggingPriority(251.0f, UILayoutConstraintAxis.Horizontal);
    }
    public final void init_late_Ofn3zBsV() {
        _Ofn3zBsV.setContentHuggingPriority(251.0f, UILayoutConstraintAxis.Vertical);
        _Ofn3zBsV.setContentHuggingPriority(251.0f, UILayoutConstraintAxis.Horizontal);
    }
    UIView _cY8K7xLJ;
    UIImageView _L16kYQkd;
    UILabel _Ofn3zBsV;
    UILayoutSupport _0K26Pfsn;
    UILayoutSupport _WVDz9aCv;
    }
    Object _nqbfbuCl;
    public final UIResponder get_4GeCdYmU() {
      if(_4GeCdYmU == null) {
        _4GeCdYmU = new UIResponder();
      }
      return _4GeCdYmU;
    }
    public final void set_4GeCdYmU(Object _4GeCdYmU) {
      this._4GeCdYmU = (UIResponder)_4GeCdYmU;
    }
    public final void init_4GeCdYmU() {
    }
    public static class _EpIdnVOW extends UIViewController {
      private UIViewController get_EpIdnVOW() {
        return this;
      }
      
      protected void loadViewFromStoryboard() {
        setView(get_G0h5Dfvb());
        init_late_G0h5Dfvb();
        view().layoutSubviews();
      }
      public _EpIdnVOW() {
        _thtjqAKh = topLayoutGuide();
        _xLUcBF4G = bottomLayoutGuide();
        navigationItem().setTitle("Setting");
        navigationItem().setRightBarButtonItem(get_2PSc131n());
        navigationItem().setLeftBarButtonItem(get_XsWkasan());
        setTitle("Setting");
        org.crossmobile.build.StoryBoardBinder.bindStoryboardWithViewController(_EpIdnVOW.this, get_Storyboard());

      }
    public final UIView get_G0h5Dfvb() {
      if(_G0h5Dfvb == null) {
        _G0h5Dfvb = new UIView();
        _G0h5Dfvb.setContentMode(0);
        _G0h5Dfvb.setFrame(new CGRect(0.0f, 0.0f, 375.0f, 667.0f));
        _G0h5Dfvb.setBackgroundColor(UIColor.white());
        _G0h5Dfvb.setAutoresizingMask(UIViewAutoresizing.FlexibleWidth | UIViewAutoresizing.FlexibleHeight);
        _G0h5Dfvb.addSubview(get_zXyGPQnl());
        _G0h5Dfvb.addSubview(get_OUI5Arax());
        _G0h5Dfvb.addSubview(get_xvNoS8DP());
        _G0h5Dfvb.addSubview(get_BEvBiPJU());
        init_late_zXyGPQnl();
        init_late_OUI5Arax();
        init_late_xvNoS8DP();
        init_late_BEvBiPJU();
      }
      return _G0h5Dfvb;
    }
    public final UITextField get_zXyGPQnl() {
      if(_zXyGPQnl == null) {
        _zXyGPQnl = new UITextField();
        _zXyGPQnl.setOpaque(false);
        _zXyGPQnl.setContentMode(0);
        _zXyGPQnl.setTranslatesAutoresizingMaskIntoConstraints(false);
        _zXyGPQnl.setFrame(new CGRect(16.0f, 52.0f, 343.0f, 34.0f));
        _zXyGPQnl.setContentHorizontalAlignment(1);
        _zXyGPQnl.setContentVerticalAlignment(0);
        _zXyGPQnl.setPlaceholder("Server Address");
        _zXyGPQnl.setBorderStyle(3);
        _zXyGPQnl.setFont(UIFont.systemFontOfSize(14.0f));
        _zXyGPQnl.setTextAlignment(NSTextAlignment.Natural);
      }
      return _zXyGPQnl;
    }
    public final UITextField get_OUI5Arax() {
      if(_OUI5Arax == null) {
        _OUI5Arax = new UITextField();
        _OUI5Arax.setOpaque(false);
        _OUI5Arax.setContentMode(0);
        _OUI5Arax.setTranslatesAutoresizingMaskIntoConstraints(false);
        _OUI5Arax.setFrame(new CGRect(16.0f, 94.0f, 343.0f, 34.0f));
        _OUI5Arax.setContentHorizontalAlignment(1);
        _OUI5Arax.setContentVerticalAlignment(0);
        _OUI5Arax.setPlaceholder("Key");
        _OUI5Arax.setBorderStyle(3);
        _OUI5Arax.setFont(UIFont.systemFontOfSize(14.0f));
        _OUI5Arax.setTextAlignment(NSTextAlignment.Natural);
      }
      return _OUI5Arax;
    }
    public final UIButton get_xvNoS8DP() {
      if(_xvNoS8DP == null) {
        _xvNoS8DP = UIButton.buttonWithType(UIButtonType.Custom);
        _xvNoS8DP.setOpaque(false);
        _xvNoS8DP.setContentMode(0);
        _xvNoS8DP.setTranslatesAutoresizingMaskIntoConstraints(false);
        _xvNoS8DP.setFrame(new CGRect(16.0f, 136.0f, 107.0f, 22.0f));
        _xvNoS8DP.setContentHorizontalAlignment(0);
        _xvNoS8DP.setContentVerticalAlignment(0);
        _xvNoS8DP.setTitle("Reconnect", UIControlState.Normal);
        _xvNoS8DP.setImage(UIImage.imageNamed("target"), UIControlState.Normal);
        _xvNoS8DP.setTitleColor(UIColor.white(), UIControlState.Normal);
      }
      return _xvNoS8DP;
    }
    public final UIButton get_BEvBiPJU() {
      if(_BEvBiPJU == null) {
        _BEvBiPJU = UIButton.buttonWithType(UIButtonType.Custom);
        _BEvBiPJU.setOpaque(false);
        _BEvBiPJU.setContentMode(0);
        _BEvBiPJU.setTranslatesAutoresizingMaskIntoConstraints(false);
        _BEvBiPJU.setFrame(new CGRect(16.0f, 166.0f, 145.0f, 22.0f));
        _BEvBiPJU.setContentHorizontalAlignment(0);
        _BEvBiPJU.setContentVerticalAlignment(0);
        _BEvBiPJU.setTitle("Reset All Prices", UIControlState.Normal);
        _BEvBiPJU.setImage(UIImage.imageNamed("arrow.triangle.2.circlepath.circle"), UIControlState.Normal);
        _BEvBiPJU.setTitleColor(UIColor.white(), UIControlState.Normal);
      }
      return _BEvBiPJU;
    }
    public final UIBarButtonItem get_2PSc131n() {
      if(_2PSc131n == null) {
        _2PSc131n = new UIBarButtonItem(UIBarButtonSystemItem.Save, ()->{
        });
      }
      return _2PSc131n;
    }
    public final UIBarButtonItem get_XsWkasan() {
      if(_XsWkasan == null) {
        _XsWkasan = new UIBarButtonItem(UIBarButtonSystemItem.Cancel, ()->{
        });
      }
      return _XsWkasan;
    }
    public final void init_late_G0h5Dfvb() {
        NSLayoutConstraint.constraintWithItem(_G0h5Dfvb, NSLayoutAttribute.Trailing, NSLayoutRelation.RelationEqual, _OUI5Arax, NSLayoutAttribute.Trailing, 1f, 16f).setActive(true);
        NSLayoutConstraint.constraintWithItem(_G0h5Dfvb, NSLayoutAttribute.Trailing, NSLayoutRelation.RelationEqual, _zXyGPQnl, NSLayoutAttribute.Trailing, 1f, 16f).setActive(true);
        NSLayoutConstraint.constraintWithItem(_zXyGPQnl, NSLayoutAttribute.Top, NSLayoutRelation.RelationEqual, _thtjqAKh, NSLayoutAttribute.Bottom, 1f, 8f).setActive(true);
        NSLayoutConstraint.constraintWithItem(_OUI5Arax, NSLayoutAttribute.Top, NSLayoutRelation.RelationEqual, _zXyGPQnl, NSLayoutAttribute.Bottom, 1f, 8f).setActive(true);
        NSLayoutConstraint.constraintWithItem(_xvNoS8DP, NSLayoutAttribute.Leading, NSLayoutRelation.RelationEqual, _G0h5Dfvb, NSLayoutAttribute.Leading, 1f, 16f).setActive(true);
        NSLayoutConstraint.constraintWithItem(_OUI5Arax, NSLayoutAttribute.Leading, NSLayoutRelation.RelationEqual, _G0h5Dfvb, NSLayoutAttribute.Leading, 1f, 16f).setActive(true);
        NSLayoutConstraint.constraintWithItem(_xvNoS8DP, NSLayoutAttribute.Top, NSLayoutRelation.RelationEqual, _OUI5Arax, NSLayoutAttribute.Bottom, 1f, 8f).setActive(true);
        NSLayoutConstraint.constraintWithItem(_BEvBiPJU, NSLayoutAttribute.Top, NSLayoutRelation.RelationEqual, _xvNoS8DP, NSLayoutAttribute.Bottom, 1f, 8f).setActive(true);
        NSLayoutConstraint.constraintWithItem(_zXyGPQnl, NSLayoutAttribute.Leading, NSLayoutRelation.RelationEqual, _G0h5Dfvb, NSLayoutAttribute.Leading, 1f, 16f).setActive(true);
        NSLayoutConstraint.constraintWithItem(_BEvBiPJU, NSLayoutAttribute.Leading, NSLayoutRelation.RelationEqual, _G0h5Dfvb, NSLayoutAttribute.Leading, 1f, 16f).setActive(true);
    }
    public final void init_late_zXyGPQnl() {
    }
    public final void init_late_OUI5Arax() {
    }
    public final void init_late_xvNoS8DP() {
    }
    public final void init_late_BEvBiPJU() {
    }
    UIView _G0h5Dfvb;
    UITextField _zXyGPQnl;
    UITextField _OUI5Arax;
    UIButton _xvNoS8DP;
    UIButton _BEvBiPJU;
    UILayoutSupport _thtjqAKh;
    UILayoutSupport _xLUcBF4G;
    UIBarButtonItem _2PSc131n;
    UIBarButtonItem _XsWkasan;
    }
    UIResponder _4GeCdYmU;
    public final UIResponder get_fcVbFVhM() {
      if(_fcVbFVhM == null) {
        _fcVbFVhM = new UIResponder();
      }
      return _fcVbFVhM;
    }
    public final void set_fcVbFVhM(Object _fcVbFVhM) {
      this._fcVbFVhM = (UIResponder)_fcVbFVhM;
    }
    public final void init_fcVbFVhM() {
    }
    public static class _aDUQ4k2C extends UITableViewController {
      private UITableViewController get_aDUQ4k2C() {
        return this;
      }
      
      protected void loadViewFromStoryboard() {
        setView(tableView());
        tableView().reloadData();
        init_late_3UAfKUr4();
      }
      @Override
      public UITableView tableView() {
        return get_3UAfKUr4();
      }
      public _aDUQ4k2C() {
        navigationItem().setRightBarButtonItem(get_5O0M06w6());
        navigationItem().setLeftBarButtonItem(get_sBnxKvcj());
        org.crossmobile.build.StoryBoardBinder.bindStoryboardWithViewController(_aDUQ4k2C.this, get_Storyboard());

      }
    public final UITableView get_3UAfKUr4() {
      if(_3UAfKUr4 == null) {
        _3UAfKUr4 = new UITableView();
        _3UAfKUr4.registerClass(_mPI7s1xR_Prototype.class,"ProductTableViewCell");
;
        _3UAfKUr4.setDataSource(get_aDUQ4k2C());
        _3UAfKUr4.setDelegate(get_aDUQ4k2C());
        _3UAfKUr4.setClipsToBounds(true);
        _3UAfKUr4.setContentMode(0);
        _3UAfKUr4.setFrame(new CGRect(0.0f, 0.0f, 375.0f, 667.0f));
        _3UAfKUr4.setBackgroundColor(UIColor.white());
        _3UAfKUr4.setAutoresizingMask(UIViewAutoresizing.FlexibleWidth | UIViewAutoresizing.FlexibleHeight);
        _3UAfKUr4.setAlwaysBounceVertical(true);
        _3UAfKUr4.setRowHeight(-1.0f);
        _3UAfKUr4.setSeparatorStyle(0);
      }
      return _3UAfKUr4;
    }
    public class _mPI7s1xR_Prototype extends UITableViewCell {
      public _mPI7s1xR_Prototype() {
        super(0, "ProductTableViewCell");
        this.setClipsToBounds(true);
        this.setContentMode(0);
        this.setFrame(new CGRect(0.0f, 28.0f, 375.0f, 75.0f));
        this.setSelectionStyle(3);
        this.setPreservesSuperviewLayoutMargins(true);
        org.crossmobile.build.StoryBoardBinder.bindRowHeightToTableViewCell(this, 75.0f);
        this.contentView().setOpaque(false);
        this.contentView().setClipsToBounds(true);
        this.contentView().setMultipleTouchEnabled(true);
        this.contentView().setContentMode(4);
        this.contentView().setFrame(new CGRect(0.0f, 0.0f, 375.0f, 75.0f));
        this.contentView().addSubview(get_sALQZfOQ());
        this.contentView().addSubview(get_tMs1EJhj());
        this.contentView().addSubview(get_iFPk8H9T());
        this.contentView().addSubview(get_XpMUoKWQ());
        this.contentView().addSubview(get_vEOA647a());
        init_late_sALQZfOQ();
        init_late_tMs1EJhj();
        init_late_iFPk8H9T();
        init_late_XpMUoKWQ();
        init_late_vEOA647a();
      }
    public final UILabel get_sALQZfOQ() {
      if(_sALQZfOQ == null) {
        _sALQZfOQ = new UILabel();
        _sALQZfOQ.setOpaque(false);
        _sALQZfOQ.setUserInteractionEnabled(false);
        _sALQZfOQ.setContentMode(7);
        _sALQZfOQ.setTranslatesAutoresizingMaskIntoConstraints(false);
        _sALQZfOQ.setFrame(new CGRect(16.0f, 11.0f, 37.0f, 23.0f));
        _sALQZfOQ.setAutoresizingMask(UIViewAutoresizing.FlexibleRightMargin | UIViewAutoresizing.FlexibleBottomMargin);
        _sALQZfOQ.setText("Title");
        _sALQZfOQ.setTextAlignment(NSTextAlignment.Natural);
        _sALQZfOQ.setFont(UIFont.systemFontOfSize(19.0f));
        _sALQZfOQ.setAdjustsFontSizeToFitWidth(false);
        _sALQZfOQ.setBaselineAdjustment(UIBaselineAdjustment.AlignBaselines);
      }
      return _sALQZfOQ;
    }
    public final UILabel get_tMs1EJhj() {
      if(_tMs1EJhj == null) {
        _tMs1EJhj = new UILabel();
        _tMs1EJhj.setOpaque(false);
        _tMs1EJhj.setUserInteractionEnabled(false);
        _tMs1EJhj.setContentMode(7);
        _tMs1EJhj.setTranslatesAutoresizingMaskIntoConstraints(false);
        _tMs1EJhj.setFrame(new CGRect(16.0f, 46.0f, 77.0f, 18.0f));
        _tMs1EJhj.setAutoresizingMask(UIViewAutoresizing.FlexibleRightMargin | UIViewAutoresizing.FlexibleBottomMargin);
        _tMs1EJhj.setText("last update");
        _tMs1EJhj.setTextAlignment(NSTextAlignment.Natural);
        _tMs1EJhj.setFont(UIFont.systemFontOfSize(15.0f));
        _tMs1EJhj.setAdjustsFontSizeToFitWidth(false);
        _tMs1EJhj.setBaselineAdjustment(UIBaselineAdjustment.AlignBaselines);
      }
      return _tMs1EJhj;
    }
    public final UIButton get_iFPk8H9T() {
      if(_iFPk8H9T == null) {
        _iFPk8H9T = UIButton.buttonWithType(UIButtonType.Custom);
        _iFPk8H9T.setOpaque(false);
        _iFPk8H9T.setContentMode(0);
        _iFPk8H9T.setTranslatesAutoresizingMaskIntoConstraints(false);
        _iFPk8H9T.setFrame(new CGRect(101.0f, 44.0f, 24.0f, 22.0f));
        _iFPk8H9T.setTintColor(UIColor.white());
        _iFPk8H9T.setAutoresizingMask(UIViewAutoresizing.FlexibleRightMargin | UIViewAutoresizing.FlexibleBottomMargin);
        _iFPk8H9T.setContentHorizontalAlignment(0);
        _iFPk8H9T.setContentVerticalAlignment(0);
        _iFPk8H9T.setImage(UIImage.imageNamed("arrow.triangle.2.circlepath"), UIControlState.Normal);
      }
      return _iFPk8H9T;
    }
    public final UIButton get_XpMUoKWQ() {
      if(_XpMUoKWQ == null) {
        _XpMUoKWQ = UIButton.buttonWithType(UIButtonType.Custom);
        _XpMUoKWQ.setOpaque(false);
        _XpMUoKWQ.setContentMode(0);
        _XpMUoKWQ.setTranslatesAutoresizingMaskIntoConstraints(false);
        _XpMUoKWQ.setFrame(new CGRect(333.0f, 44.0f, 26.0f, 22.0f));
        _XpMUoKWQ.setTintColor(UIColor.white());
        _XpMUoKWQ.setAutoresizingMask(UIViewAutoresizing.FlexibleRightMargin | UIViewAutoresizing.FlexibleBottomMargin);
        _XpMUoKWQ.setContentHorizontalAlignment(0);
        _XpMUoKWQ.setContentVerticalAlignment(0);
        _XpMUoKWQ.setImage(UIImage.imageNamed("pip.remove"), UIControlState.Normal);
      }
      return _XpMUoKWQ;
    }
    public final UIButton get_vEOA647a() {
      if(_vEOA647a == null) {
        _vEOA647a = UIButton.buttonWithType(UIButtonType.Custom);
        _vEOA647a.setOpaque(false);
        _vEOA647a.setContentMode(0);
        _vEOA647a.setTranslatesAutoresizingMaskIntoConstraints(false);
        _vEOA647a.setFrame(new CGRect(304.0f, 44.0f, 21.0f, 22.0f));
        _vEOA647a.setAutoresizingMask(UIViewAutoresizing.FlexibleRightMargin | UIViewAutoresizing.FlexibleBottomMargin);
        _vEOA647a.setContentHorizontalAlignment(0);
        _vEOA647a.setContentVerticalAlignment(0);
        _vEOA647a.setImage(UIImage.imageNamed("square.and.pencil"), UIControlState.Normal);
      }
      return _vEOA647a;
    }
    public final void init_late_sALQZfOQ() {
        _sALQZfOQ.setContentHuggingPriority(251.0f, UILayoutConstraintAxis.Vertical);
        _sALQZfOQ.setContentHuggingPriority(251.0f, UILayoutConstraintAxis.Horizontal);
    }
    public final void init_late_tMs1EJhj() {
        _tMs1EJhj.setContentHuggingPriority(251.0f, UILayoutConstraintAxis.Vertical);
        _tMs1EJhj.setContentHuggingPriority(251.0f, UILayoutConstraintAxis.Horizontal);
    }
    public final void init_late_iFPk8H9T() {
    }
    public final void init_late_XpMUoKWQ() {
    }
    public final void init_late_vEOA647a() {
    }
    UILabel _sALQZfOQ;
    UILabel _tMs1EJhj;
    UIButton _iFPk8H9T;
    UIButton _XpMUoKWQ;
    UIButton _vEOA647a;
    }
    public final UIBarButtonItem get_5O0M06w6() {
      if(_5O0M06w6 == null) {
        _5O0M06w6 = new UIBarButtonItem(UIBarButtonSystemItem.Add, ()->{
                    if(get_aDUQ4k2C().shouldPerformSegueWithIdentifier(null, _5O0M06w6)) {
            get_aDUQ4k2C().prepareForSegue(get_vRHWZWxt(), _5O0M06w6);
            _vRHWZWxt.perform();
          }
;
        });
      }
      return _5O0M06w6;
    }
    public final UIStoryboardSegue get_vRHWZWxt() {
      if(_vRHWZWxt == null) {
        _vRHWZWxt = new UIStoryboardSegue(null, get_aDUQ4k2C(), new _deRJlpf6()) {
          @Override
          public void perform() {
            get_aDUQ4k2C().showViewController(destinationViewController(), true);
          }
        };
      }
      return _vRHWZWxt;
    }
    public final UIBarButtonItem get_sBnxKvcj() {
      if(_sBnxKvcj == null) {
        _sBnxKvcj = new UIBarButtonItem(UIImage.imageNamed("target"), UIBarButtonItemStyle.Plain, ()->{
        });
      }
      return _sBnxKvcj;
    }
    public final void init_late_3UAfKUr4() {
    }
    UITableView _3UAfKUr4;
    UIBarButtonItem _5O0M06w6;
    UIStoryboardSegue _vRHWZWxt;
    UIBarButtonItem _sBnxKvcj;
    }
    UIResponder _fcVbFVhM;
    public final UIResponder get_ynYMx4HY() {
      if(_ynYMx4HY == null) {
        _ynYMx4HY = new UIResponder();
      }
      return _ynYMx4HY;
    }
    public final void set_ynYMx4HY(Object _ynYMx4HY) {
      this._ynYMx4HY = (UIResponder)_ynYMx4HY;
    }
    public final void init_ynYMx4HY() {
    }
    public static class _MiBAk3fe extends UITabBarController {
      private UITabBarController get_MiBAk3fe() {
        return this;
      }
            public _MiBAk3fe() {
        org.crossmobile.build.StoryBoardBinder.bindStoryboardWithViewController(_MiBAk3fe.this, get_Storyboard());

      }
    }
    UIResponder _ynYMx4HY;
    public final UIResponder get_0qMSP2DX() {
      if(_0qMSP2DX == null) {
        _0qMSP2DX = new UIResponder();
      }
      return _0qMSP2DX;
    }
    public final void set_0qMSP2DX(Object _0qMSP2DX) {
      this._0qMSP2DX = (UIResponder)_0qMSP2DX;
    }
    public final void init_0qMSP2DX() {
    }
    public static class _zmKIUaUF extends UINavigationController {
      private UINavigationController get_zmKIUaUF() {
        return this;
      }
            public _zmKIUaUF() {
super(new _aDUQ4k2C());
        org.crossmobile.build.StoryBoardBinder.bindStoryboardWithViewController(_zmKIUaUF.this, get_Storyboard());
        navigationBar().setTranslucent(true);
        navigationBar().setBarStyle(0);

      }
    public final UINavigationBar get_SaBnWsCl() {
      if(_SaBnWsCl == null) {
        _SaBnWsCl = new UINavigationBar();
        _SaBnWsCl.setContentMode(0);
        _SaBnWsCl.setFrame(new CGRect(0.0f, 0.0f, 375.0f, 44.0f));
      }
      return _SaBnWsCl;
    }
    public final void init_late_SaBnWsCl() {
    }
    UINavigationBar _SaBnWsCl;
    }
    UIResponder _0qMSP2DX;
    public final UIResponder get_aW8KYxQk() {
      if(_aW8KYxQk == null) {
        _aW8KYxQk = new UIResponder();
      }
      return _aW8KYxQk;
    }
    public final void set_aW8KYxQk(Object _aW8KYxQk) {
      this._aW8KYxQk = (UIResponder)_aW8KYxQk;
    }
    public final void init_aW8KYxQk() {
    }
    public static class _LPVseuHa extends UINavigationController {
      private UINavigationController get_LPVseuHa() {
        return this;
      }
            public _LPVseuHa() {
super(new _EpIdnVOW());
        org.crossmobile.build.StoryBoardBinder.bindStoryboardWithViewController(_LPVseuHa.this, get_Storyboard());
        navigationBar().setTranslucent(true);
        navigationBar().setBarStyle(0);

      }
    public final UINavigationBar get_4k64jYS5() {
      if(_4k64jYS5 == null) {
        _4k64jYS5 = new UINavigationBar();
        _4k64jYS5.setContentMode(0);
        _4k64jYS5.setFrame(new CGRect(0.0f, 0.0f, 375.0f, 44.0f));
      }
      return _4k64jYS5;
    }
    public final void init_late_4k64jYS5() {
    }
    UINavigationBar _4k64jYS5;
    }
    UIResponder _aW8KYxQk;
    @Override
    public UIViewController instantiateViewControllerWithIdentifier(String identifier) {
      switch (identifier){
      }
      return null;
    }
  }
  public static class Launch_Screen_storyboard extends UIStoryboard {
    public Launch_Screen_storyboard() {
      setStoryBoard(this);
    }
    private static Launch_Screen_storyboard Launch_Screen_storyboard_singleton;
    private void setStoryBoard(Launch_Screen_storyboard storyboard) {
      Launch_Screen_storyboard_singleton = this;
    }
    public static Launch_Screen_storyboard get_Storyboard() {
      return Launch_Screen_storyboard_singleton;
    }
    @Override
    public UIViewController instantiateInitialViewController() {
      return new _01JlpoVM();
    }
    public final Object get_iYjKqEa1() {
      if(_iYjKqEa1 == null) {
        _iYjKqEa1 = new Object();
      }
      return _iYjKqEa1;
    }
    public final void set_iYjKqEa1(Object _iYjKqEa1) {
      this._iYjKqEa1 = (Object)_iYjKqEa1;
    }
    public final void init_iYjKqEa1() {
    }
    public static class _01JlpoVM extends UIViewController {
      private UIViewController get_01JlpoVM() {
        return this;
      }
      
      protected void loadViewFromStoryboard() {
        setView(get_Ze56b2t3());
        init_late_Ze56b2t3();
        view().layoutSubviews();
      }
      public _01JlpoVM() {
        _VWI8ejkC = topLayoutGuide();
        _1mZDyAJE = bottomLayoutGuide();
        org.crossmobile.build.StoryBoardBinder.bindStoryboardWithViewController(_01JlpoVM.this, get_Storyboard());

      }
    public final UIView get_Ze56b2t3() {
      if(_Ze56b2t3 == null) {
        _Ze56b2t3 = new UIView();
        _Ze56b2t3.setContentMode(0);
        _Ze56b2t3.setFrame(new CGRect(0.0f, 0.0f, 375.0f, 667.0f));
        _Ze56b2t3.setBackgroundColor(UIColor.colorWithRedGreenBlueAlpha(1.0f, 1.0f, 1.0f, 1.0f));
        _Ze56b2t3.setAutoresizingMask(UIViewAutoresizing.FlexibleLeftMargin | UIViewAutoresizing.FlexibleWidth | UIViewAutoresizing.FlexibleHeight);
        _Ze56b2t3.addSubview(get_Fapaifwg());
        init_late_Fapaifwg();
      }
      return _Ze56b2t3;
    }
    public final UIImageView get_Fapaifwg() {
      if(_Fapaifwg == null) {
        _Fapaifwg = new UIImageView();
        _Fapaifwg.setClipsToBounds(true);
        _Fapaifwg.setUserInteractionEnabled(false);
        _Fapaifwg.setContentMode(0);
        _Fapaifwg.setTranslatesAutoresizingMaskIntoConstraints(false);
        _Fapaifwg.setFrame(new CGRect(108.0f, 197.5f, 159.0f, 220.0f));
        _Fapaifwg.setImage(UIImage.imageNamed("logo.png"));
      }
      return _Fapaifwg;
    }
    public final void init_late_Ze56b2t3() {
        NSLayoutConstraint.constraintWithItem(_Ze56b2t3, NSLayoutAttribute.CenterY, NSLayoutRelation.RelationEqual, _Fapaifwg, NSLayoutAttribute.CenterY, 1f, 26f).setActive(true);
        NSLayoutConstraint.constraintWithItem(_Fapaifwg, NSLayoutAttribute.CenterX, NSLayoutRelation.RelationEqual, _Ze56b2t3, NSLayoutAttribute.CenterX, 1f, 0f).setActive(true);
    }
    public final void init_late_Fapaifwg() {
        NSLayoutConstraint.constraintWithItem(_Fapaifwg, NSLayoutAttribute.Height, NSLayoutRelation.RelationEqual, null, NSLayoutAttribute.NotAnAttribute, 1f, 220f).setActive(true);
        NSLayoutConstraint.constraintWithItem(_Fapaifwg, NSLayoutAttribute.Width, NSLayoutRelation.RelationEqual, null, NSLayoutAttribute.NotAnAttribute, 1f, 159f).setActive(true);
        _Fapaifwg.setContentHuggingPriority(251.0f, UILayoutConstraintAxis.Vertical);
        _Fapaifwg.setContentHuggingPriority(251.0f, UILayoutConstraintAxis.Horizontal);
    }
    UIView _Ze56b2t3;
    UIImageView _Fapaifwg;
    UILayoutSupport _VWI8ejkC;
    UILayoutSupport _1mZDyAJE;
    }
    Object _iYjKqEa1;
    @Override
    public UIViewController instantiateViewControllerWithIdentifier(String identifier) {
      switch (identifier){
      }
      return null;
    }
  }
}
