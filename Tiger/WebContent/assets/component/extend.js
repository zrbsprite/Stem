//扩展日期选择器组件
A.Component.add({
	datetime: {
		selector: '[data-role="article"].active',
		event: 'articleload',
		handler: function(el, roleType) {
			var $el = $(el);
			var _work = function($el) {
				var $label = $el.find('label'),$input,placeholder;
				if($label.length==1){
					$input = $el.find('input');
					placeholder = $label.html();
				}else{
					$input = $el;
					placeholder = '';
				}
				
				$el.on(A.options.clickEvent, function(e) {
					/*
					$native.openDateTimeSelector({
						mode: $el.data('role'),
						val: $input.val(),
						callback: function(str) {
							if (str && ($input.val() != str) && $el.data('change')) {
								eval($el.data('change'));
							}
							$label.html(str ? str : placeholder);
							$input.val(str || '');
						}
					});
					*/
					function _clear() {
						$label.html(placeholder);
						$input.val('');
					}

					function timepicker_callback(e) {
						var _date = null,
							_date_string_array = $input.val().split(':'),
							today = new Date();

						if (_date_string_array.length == 2) {
							_date = new Date(today.getFullYear(), today.getMonth(), today.getDate(), parseInt(_date_string_array[0], 10), parseInt(_date_string_array[1], 10), 0);
						} else {
							_date = today;
						}

						return picker.select(_date, function(data) {
							var _date = data.date,
								_date_string = data.timeString;
							$label.html(_date_string ? _date_string : placeholder);
							$input.val(_date_string);
						});
					}

					function datepicker_callback() {
						var _date = null,
							_date_string_array = $input.val().split('-');

						if (_date_string_array.length == 3) {
							_date = new Date(_date_string_array[0], parseInt(_date_string_array[1]) - 1, _date_string_array[2]);
						} else {
							_date = new Date();
						}

						return picker.select(_date, function(data) {
							var _date = data.date,
								_date_string = data.dateString;
							$label.html(_date_string ? _date_string : placeholder);
							$input.val(_date_string);
						});
					}

					var type = $el.data('role')||$el.attr('type');

					var picker;

					if (type == 'time') {
						picker = A.Timepicker({
							hasSecond: false,
							isCustomLeftButton: true,
							customLeftButtonName:'清除',
							customLeftButtonCallback: _clear
						});
						timepicker_callback(e);
					} else if (type == 'date') {
						picker = A.Datepicker({
							hasClear: true,
							isCustomLeftButton: true,
							customLeftButtonName:'清除',
							customLeftButtonCallback: _clear
						});
						datepicker_callback(e);
					}

					return false;
				});
				$label.html($input.val() || placeholder);
			};

			if ($el.data('role') == 'date' || $el.data('role') == 'time' || $el.attr('type') == 'date' || $el.attr('type') == 'time') {
				_work($el);
			} else {
				var components = $el.find('[data-role="date"],[data-role="time"],input[type="date"],input[type="time"]');
				for (var i = 0; i < components.length; i++) {
					_work($(components[i]));
				}
			}

		}
	}
});
